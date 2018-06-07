package ank.hao.webservice;

import ank.hao.webservice.service.PeopleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.net.MalformedURLException;
import java.net.URL;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(WSConfig.class)
public class WSDemo {

    @Autowired
    private PeopleService peopleService;

    @Test
    public void test(){
        peopleService.say();
        String take = peopleService.study();
        System.out.println("kaj");
    }

}

@Configuration
class WSConfig{

    @Bean
    public JaxWsPortProxyFactoryBean peopleService() throws MalformedURLException {
        JaxWsPortProxyFactoryBean proxy = new JaxWsPortProxyFactoryBean();
        proxy.setWsdlDocumentUrl(new URL("http://localhost:8888/services/PeopleService?wsdl"));
        proxy.setServiceName("PeopleService");
        proxy.setPortName("PeopleServiceEndpointPort");
        proxy.setServiceInterface(PeopleService.class);
        proxy.setNamespaceUri("http://service.webservice.hao.ank/");
        return proxy;
    }
}
