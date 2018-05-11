import ank.orm.hibernate.config.InitializeConfig;
import ank.orm.hibernate.domain.User;
import ank.orm.hibernate.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(InitializeConfig.class)
public class HibernateDemo {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test(){
        User user = new User("hibernate",45);
        userRepository.add(user);
    }
}
