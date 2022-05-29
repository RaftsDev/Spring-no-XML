package com.raftsdev.springdemo;

public class SwimCoach implements Coach {
	
	FortuneService fortuneService;
	
	SwimCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim a 1000 meters.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
