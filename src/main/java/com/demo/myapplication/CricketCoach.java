/**
 * 
 */
package com.demo.myapplication;

import org.springframework.stereotype.Component;

import com.demo.myapplication.api.Coach;

/**
 * 
 */
@Component
public class CricketCoach implements Coach {

	@Override
	public String dailyWorkout() {
		return "Practice Fast bowling for 15 mins.";
	}

}
