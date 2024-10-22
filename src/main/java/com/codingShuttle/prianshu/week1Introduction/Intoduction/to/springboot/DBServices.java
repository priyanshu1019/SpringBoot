package com.codingShuttle.prianshu.week1Introduction.Intoduction.to.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBServices {
    @Autowired
    private DevDB db;

    String getData(){
        return db.getData();
    }
}
