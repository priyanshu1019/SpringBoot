package com.codingShuttle.prianshu.week1Introduction.Intoduction.to.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope("prototype")//this will create two apple objects
//    @Scope("singleton")

    Apple getApple(){
        return new Apple();
    }
}
