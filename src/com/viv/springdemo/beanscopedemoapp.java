package com.viv.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanscopedemoapp {

	public static void main(String[] args) {
		
		// Load spring config file
		ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");
		
	}

}
