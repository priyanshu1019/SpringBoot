package com.codingShuttle.prianshu.week1Introduction.Intoduction.to.springboot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
//makes this class a bean
//@Component
public class Apple {
    void eatApple(){
        System.out.println("Eating apple");
    }
    @PostConstruct
    void callThisBeforeAppleIsUsed(){
        System.out.println("before apple use");
    }
    @PreDestroy
    void callThisBeforeDestroyed(){
        System.out.println("before destroying");
    }
}
