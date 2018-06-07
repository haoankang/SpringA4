package thirteen.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;

@Component
public class ExpressionSecuredUserService implements UserService {

    @PreAuthorize("hasRole('ROLE_SAMA')")
    public void testSecured() {
        System.out.println("test secured success.");
    }
}
