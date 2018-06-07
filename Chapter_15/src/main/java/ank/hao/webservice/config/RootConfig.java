package ank.hao.webservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

@Configuration
@ComponentScan("ank.hao.webservice")
public class RootConfig {

    @Bean
    public SimpleJaxWsServiceExporter jaxWsServiceExporter(){
        SimpleJaxWsServiceExporter simpleJaxWsServiceExporter = new SimpleJaxWsServiceExporter();
        simpleJaxWsServiceExporter.setBaseAddress("http://localhost:8888/services/");
        return simpleJaxWsServiceExporter;
    }
}
