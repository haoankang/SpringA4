package thirteen.service;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import thirteen.config.InitialConfig;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(InitialConfig.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @org.junit.Test
    public void testSecured() {
        setupUser("ROLE_SAMA");
        userService.testSecured();
    }

    private void setupUser(String... privs) {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        for (String priv : privs) {
            authorities.add(new SimpleGrantedAuthority(priv));
        }
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken("user", "password", authorities);
        securityContext.setAuthentication(authenticationToken);
    }
}
