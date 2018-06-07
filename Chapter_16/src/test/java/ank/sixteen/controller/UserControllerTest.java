package ank.sixteen.controller;

import ank.sixteen.config.InitialConfig;
import ank.sixteen.dto.User;
import ank.sixteen.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitWebConfig(InitialConfig.class)
public class UserControllerTest {

    @Autowired
    private UserService userService;

    @Test
    public void test(){

        List<User> list = userService.queryList();
        System.out.println(list);
    }

}
