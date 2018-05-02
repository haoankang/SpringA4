import config.SpringInitialize;
import dto.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;
import repository.UserRepository;

public class Initiator {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringInitialize.class);
        ConfigurableEnvironment environment = new StandardEnvironment();
        applicationContext.setEnvironment(environment);
        UserRepository userRepository = applicationContext.getBean(UserRepository.class);
        User user = new User("hak",23);
        userRepository.add(user);
    }
}
