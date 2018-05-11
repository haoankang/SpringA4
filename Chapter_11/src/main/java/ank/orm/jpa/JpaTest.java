package ank.orm.jpa;

import ank.orm.jpa.config.InitializeConfig;
import ank.orm.jpa.domain.User;
import ank.orm.jpa.repository.UserRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JpaTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(InitializeConfig.class);
        UserRepository userRepository = applicationContext.getBean(UserRepository.class);
        User user = new User("jpa",22);
        userRepository.add(user);
        System.out.println("kkak");
        System.out.println("llalfsd");
    }
}
