package t.l.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;
import t.l.dto.User;
import t.l.repository.UserRepository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class JdbcUserRepository implements UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int addUser(User user) {
        return jdbcTemplate.update("insert into user(name,age) VALUES(?,?)",user.getName(),user.getAge());
    }

    public User queryById(Integer id) {
        return jdbcTemplate.query("select * from user where id=?", new UserResultSetExtractor(), id);
    }

    public int updateUser(User user) {
        return 0;
    }

    public int deleteUser(User user) {
        return 0;
    }

    public void evictUser(User user) {

    }

    public class UserResultSetExtractor implements ResultSetExtractor<User>{

        public User extractData(ResultSet resultSet) throws SQLException, DataAccessException {
            User user = new User();
            while(resultSet.next()){
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setAge(resultSet.getInt("age"));
            }
            return user;
        }
    }
}
