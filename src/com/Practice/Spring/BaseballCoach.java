package com.Practice.Spring;

public class BaseballCoach implements Coach{
	
	@Override
	public String getDailyWorkout() {
		return "30 min Batting";
	}
}
