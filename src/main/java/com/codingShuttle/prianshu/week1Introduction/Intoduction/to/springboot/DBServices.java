package com.codingShuttle.prianshu.week1Introduction.Intoduction.to.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBServices {

    //this is field injection
//    @Autowired
    final private DB db;
    //let us see how to use construct injection
    //we should use constructor injection as we can make our service final which ensures that no one can change it later.
    public DBServices(DB db){
        this.db = db;
    }
    String getData(){
        return db.getData();
    }
}
