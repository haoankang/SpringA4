import ank.orm.jpa.config.InitializeConfig;
import ank.orm.jpa.domain.User;
import ank.orm.jpa.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = InitializeConfig.class)
public class JpaDemo {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test(){
        User user = new User("jpa",46);
        userRepository.saveAndFlush(user);
        System.out.println("kaka");
    }
}
