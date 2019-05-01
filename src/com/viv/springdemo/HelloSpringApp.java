package com.viv.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load spring conf
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrive a bean from the container 
		Coach theCoach = context.getBean("myCoach",Coach.class);
		//call methods on the bean
		
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		//close the app context
		context.close();
	}

}
