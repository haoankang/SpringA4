package ank.orm.hibernate.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan("ank.orm.hibernate")
public class InitializeConfig {

    @Bean
    public DataSource dataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://10.100.1.210:3306/hak_test");
        dataSource.setUsername("root");
        dataSource.setPassword("bangsun");
        dataSource.setInitialSize(2);
        dataSource.setMaxTotal(3);
        return dataSource;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactoryBean(DataSource dataSource){
        LocalSessionFactoryBean sfb = new LocalSessionFactoryBean();
        sfb.setDataSource(dataSource);
        sfb.setPackagesToScan(new String[]{"ank.orm.hibernate.domain"});
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect","org.hibernate.dialect.H2Dialect");
        sfb.setHibernateProperties(properties);
        return sfb;
    }

    @Bean
    public BeanPostProcessor persistenceTranslation(){
        return new PersistenceExceptionTranslationPostProcessor();
    }
}
