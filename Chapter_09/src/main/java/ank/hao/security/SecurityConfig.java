package ank.hao.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.authentication.rememberme.InMemoryTokenRepositoryImpl;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .and()
                .httpBasic();
//        http
//                .formLogin()
//                .loginPage("/login")
//                .and()
//                .logout()
//                .logoutSuccessUrl("/")
//                .and()
//                .rememberMe()
//                .tokenRepository(new InMemoryTokenRepositoryImpl())
//                .tokenValiditySeconds(2419200)
//                .key("spittrKey")
//                .and()
//                .httpBasic()
//                .realmName("Spittr")
//                .and()
//                .authorizeRequests()
//                .antMatchers("/").authenticated()
//                .antMatchers("/spitter/me").authenticated()
//                .antMatchers(HttpMethod.POST, "/spittles").authenticated()
//                .anyRequest().permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("user").password("password").roles("USER")
                .and()
                .withUser("admin").password("admin").roles("USER","ADMIN");
    }

    @Bean
    public static NoOpPasswordEncoder passwordEncoder(){
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }
}
