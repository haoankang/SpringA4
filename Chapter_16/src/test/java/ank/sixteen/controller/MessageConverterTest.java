package ank.sixteen.controller;

import ank.sixteen.dto.User;
import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriTemplateHandler;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(TestConfig.class)
public class MessageConverterTest {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void test(){
        ResponseEntity<User> responseEntity = restTemplate.getForEntity("http://localhost:8081/user/getUserById/3",User.class, (Object) null);
        System.out.println("kaf");
    }

}

@Configuration
class TestConfig{

    @Bean
    public RestTemplate restTemplate(){
        RestTemplate restTemplate = new RestTemplate();
        Map<String,String> map = new HashMap<>();
        //map.put("url","http://localhost:8081");
        restTemplate.setDefaultUriVariables(map);
        return restTemplate;
    }
}
