package ank.hao.hessian.config;

import ank.hao.hessian.service.PeopleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

import java.util.Properties;

@Configuration
@ComponentScan("ank.hao.hessian")
public class ServletConfig extends WebMvcConfigurationSupport {

    @Bean
    public HessianServiceExporter hessianServiceExporter(PeopleService peopleService){
        HessianServiceExporter hessianServiceExporter = new HessianServiceExporter();
        hessianServiceExporter.setService(peopleService);
        hessianServiceExporter.setServiceInterface(PeopleService.class);
        return hessianServiceExporter;
    }

    @Bean
    public HandlerMapping handlerMapping(){
        SimpleUrlHandlerMapping mapping = new SimpleUrlHandlerMapping();
        Properties mappings = new Properties();
        mappings.setProperty("/people.service","hessianServiceExporter");
        mapping.setMappings(mappings);
        return mapping;
    }
}
