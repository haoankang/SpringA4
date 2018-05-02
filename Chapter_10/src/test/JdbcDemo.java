import config.SpringInitialize;
import dto.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import repository.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(SpringInitialize.class)
public class JdbcDemo {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test(){
        User user = new User("ank",19);
        userRepository.add(user);
    }
}
