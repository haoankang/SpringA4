package ank.hao.hessian.config;

import ank.hao.hessian.service.PeopleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;

@Configuration
@ComponentScan("ank.hao.hessian")
public class RootConfig {

}
