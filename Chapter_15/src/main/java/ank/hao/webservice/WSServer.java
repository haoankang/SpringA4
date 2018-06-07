package ank.hao.webservice;

import ank.hao.webservice.config.RootConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

public class WSServer {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
        SimpleJaxWsServiceExporter exporter = context.getBean(SimpleJaxWsServiceExporter.class);
        exporter.publishEndpoints();
        Thread.sleep(1000000000);
    }
}
