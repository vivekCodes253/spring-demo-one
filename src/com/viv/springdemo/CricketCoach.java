package com.viv.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	private String team;
	
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("Setting email");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Setting team");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice bowling";
	}

	public CricketCoach() {
		System.out.println("Inside constructor");
	}
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
