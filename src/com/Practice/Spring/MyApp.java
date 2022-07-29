package com.Practice.Spring;

public class MyApp {
	public static void main(String args[]) {
		Coach theCoach = new TrackCoach();
		
		System.out.println(theCoach.getDailyWorkout());
	}
}
