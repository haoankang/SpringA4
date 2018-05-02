package repository;

import dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcUserRepository implements UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int add(User user) {
        return jdbcTemplate.update("insert into USER(name,age) VALUES (?,?)",user.getName(),user.getAge());
    }

    public int update(User user) {
        return 0;
    }

    public int delete(User user) {
        return 0;
    }
}
