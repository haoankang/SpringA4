package t.l.repository.t.l;

import org.junit.Test;
import t.l.dto.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcDemo {

    @Test
    public void test() throws Exception{
        String url = "jdbc:mysql://10.100.1.210:3306/hak_test";
        String user = "root";
        String pwd = "bangsun";

        //1. 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2. 获取连接
        Connection connection = DriverManager.getConnection(url,user,pwd);
        //3. 通过数据库连接操作数据库
        PreparedStatement ps = connection.prepareStatement("select * from user");
        ResultSet resultSet = ps.executeQuery();
        //4. 遍历结果
        while(resultSet.next()){
            User user1 = new User();
            user1.setId(resultSet.getInt("id"));
            user1.setName(resultSet.getString("name"));
            user1.setAge(resultSet.getInt("age"));
            System.out.println(user1);
        }

        resultSet.close();
        ps.close();
        connection.close();
    }
}
