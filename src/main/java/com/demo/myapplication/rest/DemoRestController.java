/**
 * 
 */
package com.demo.myapplication.rest;

import org.springframework.web.bind.annotation.RestController;

import com.demo.myapplication.api.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Demo Rest Controller class for understanding the Constructor Injection.
 */
@RestController
public class DemoRestController {
		
	private Coach myCoach;
	
	@Autowired
	public DemoRestController(Coach theCoach) {
		this.myCoach = theCoach;
	}
	
	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		return this.myCoach.dailyWorkout();
	}
}
