package com.viv.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanslifecycledemo {

	public static void main(String[] args) {
		// load spring config 
		//retrieve beans
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycle-applicationContext.xml");
		
		//retrieve bean
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach theCoach2 = context.getBean("myCoach",Coach.class);
		
		// check if same
		
		boolean res = (theCoach==theCoach2);
		System.out.println("\nPointer "+res);
		System.out.println("Memory location = "+theCoach);
		
		context.close();

	}

}
