package com.codingShuttle.prianshu.week1Introduction.Intoduction.to.springboot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary//this will resolve the error of two beans found but still this is tightly coupled
//@Primary
@ConditionalOnProperty(name = "deployment.env"  , havingValue = "production")
public class ProdDB implements DB {

    public String getData(){
        return "Prod Database";
    }
}
