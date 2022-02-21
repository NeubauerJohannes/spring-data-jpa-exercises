package com.bobocode.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;

/**
 * This class is provides root Java config for Spring application.
 * <p>
 * todo: 1. PLEASE NOTE, THAT SOME REQUIRED STEPS ARE OMITTED IN THE TODO LIST AND YOU HAVE TO DO IT ON YOUR OWN
 * <p>
 * todo: 2. Configure {@link PlatformTransactionManager} bean with name "transactionManager"    x
 * todo: 3. Enable transaction management   x
 */

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = "com.bobocode")
public class RootConfig {
    @Bean(name = "transactionManager")
    public PlatformTransactionManager platformTransactionManager(EntityManagerFactory entityManagerFactory){
        return new JpaTransactionManager(entityManagerFactory);
    }
}

