package ank.hao.hessian;

import ank.hao.hessian.service.PeopleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

@Configuration
@ComponentScan("ank.hao.hessian")
public class DemoConfig {

    @Bean
    public HessianProxyFactoryBean peopleService(){
        HessianProxyFactoryBean proxyFactoryBean = new HessianProxyFactoryBean();
        proxyFactoryBean.setServiceUrl("http://localhost:8080/people.service");
        proxyFactoryBean.setServiceInterface(PeopleService.class);
        return proxyFactoryBean;
    }
}
