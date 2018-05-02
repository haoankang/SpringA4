import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import repository.UserRepository;

@Import(AnnotationConfigApplicationContext.class)
public class Initiator2 {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {

    }
}
