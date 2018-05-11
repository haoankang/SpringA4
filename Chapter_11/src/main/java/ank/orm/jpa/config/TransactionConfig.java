package ank.orm.jpa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.persistence.EntityManagerFactory;

//
//@Configuration
//@EnableTransactionManagement
//public class TransactionConfig implements TransactionManagementConfigurer {
//
//    @Autowired
//    private LocalContainerEntityManagerFactoryBean emf;
//
//    public PlatformTransactionManager annotationDrivenTransactionManager() {
//        JpaTransactionManager transactionManager = new JpaTransactionManager();
//        transactionManager.setEntityManagerFactory(emf.getNativeEntityManagerFactory());
//        return transactionManager;
//    }
//}
