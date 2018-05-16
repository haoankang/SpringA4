package t.l.config;

import com.mysql.cj.jdbc.Driver;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class SpringDataJpaConfig {

    @Bean
    public DataSource dataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassLoader(Driver.class.getClassLoader());
        dataSource.setUrl("jdbc:mysql://10.100.1.210:3306/hak_test");
        dataSource.setUsername("root");
        dataSource.setPassword("bangsun");
        dataSource.setInitialSize(2);
        dataSource.setMaxActive(3);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    @Bean
    public BeanPostProcessor beanPostProcessor(){
        return new PersistenceExceptionTranslationPostProcessor();
    }
}
