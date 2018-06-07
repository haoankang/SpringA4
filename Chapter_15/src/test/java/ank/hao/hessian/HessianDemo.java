package ank.hao.hessian;

import ank.hao.hessian.service.PeopleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitWebConfig(classes = DemoConfig.class)
public class HessianDemo {

    @Autowired
    private PeopleService peopleService;

    @Test
    public void test(){
        peopleService.say();
        String take = peopleService.study();
        System.out.println("kaj");
    }
}
