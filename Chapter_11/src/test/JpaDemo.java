import ank.orm.jpa.config.InitializeConfig;
import ank.orm.jpa.domain.User;
import ank.orm.jpa.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.PersistenceUnit;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(InitializeConfig.class)
public class JpaDemo {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test(){
        User user = new User("jpa",46);
        userRepository.add(user);
        System.out.println("kaka");
    }
}
