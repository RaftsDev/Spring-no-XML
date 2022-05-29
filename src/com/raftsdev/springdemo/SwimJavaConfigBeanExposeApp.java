package com.raftsdev.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigBeanExposeApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		//Coach theCoach = context.getBean("swimCoach", Coach.class);
		
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());
		
		System.out.println("Email: "+theCoach.getEmail()+" Team: "+theCoach.getTeam());

		context.close();
	}

}
