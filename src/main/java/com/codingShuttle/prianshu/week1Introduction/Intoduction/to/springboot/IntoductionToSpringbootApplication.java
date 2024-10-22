package com.codingShuttle.prianshu.week1Introduction.Intoduction.to.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntoductionToSpringbootApplication implements CommandLineRunner {
	//indicates that this bean introtosprinbootapplcation has to inject the bean apple obj
//	@Autowired
//	Apple obj1 ;
//	@Autowired
//	Apple obj2;
	@Autowired
	DBServices dbs;

	public static void main(String[] args) {
		SpringApplication.run(IntoductionToSpringbootApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
//		obj1.eatApple();
//		obj2.eatApple();
		System.out.println(dbs.getData());
	}
}
