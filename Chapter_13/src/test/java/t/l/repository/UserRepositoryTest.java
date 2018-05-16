package t.l.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import t.l.config.InitialConfig;
import t.l.dto.User;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(InitialConfig.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @org.junit.Test
    public void addUser() {
        User user = new User("dina",33);
        userRepository.addUser(user);
    }

    @Test
    public void queryById(){
        User user = userRepository.queryById(7);
        System.out.println(user);
        userRepository.evictUser(user);

        User user1 = userRepository.queryById(7);
        System.out.println(user1);
    }

    @org.junit.Test
    public void updateUser() {
    }

    @org.junit.Test
    public void deleteUser() {
    }
}
