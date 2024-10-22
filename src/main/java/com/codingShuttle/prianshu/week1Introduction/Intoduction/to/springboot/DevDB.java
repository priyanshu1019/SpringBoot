package com.codingShuttle.prianshu.week1Introduction.Intoduction.to.springboot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deployment.env"  , havingValue = "development")
public class DevDB implements DB {
    public String getData(){
        return "Dev Database";
    }
}
