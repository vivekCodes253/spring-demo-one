package com.viv.springdemo;

public class BaseballCoach implements Coach {
	
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService)
	{
		this.fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout()
	{
		return "Spend 30 mins on batting";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
