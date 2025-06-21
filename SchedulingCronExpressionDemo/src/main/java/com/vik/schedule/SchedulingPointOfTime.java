package com.vik.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;




@Controller
public class SchedulingPointOfTime {

	// Period of time 
	
	@Scheduled(cron = "* * * * * *")
	public void evrySec() {
		System.out.println("Executes at every second");
	}
	
	@Scheduled(cron = "15 * * * * *")
	public void sec() {
		System.out.println("Executes at 15th second of every minute");
	}
	
	@Scheduled(cron = "* 15  * * * *")
	public void min() {
		System.out.println("Executes at 15th minute of every hour");
	}
	
	@Scheduled(cron = "* * 15 * * *")
	public void hour() {
		System.out.println("Executes at 15th hour [ 3pm ] of every day");
	}
	
	@Scheduled(cron = "* * * 15 * *")
	public void day() {
		System.out.println("Executes every second of 15th day of every month");
	}
	
	@Scheduled(cron = "* * * * 6 *")
	public void month() {
		System.out.println("Executes every second of 6th month of every Year");
	}
	
	@Scheduled(cron = "* * * * * 1")
	public void week() {
		System.out.println("Executes every second of Monday of every week");
	}
	
	@Scheduled(cron = "0 0 0 16 6 *")
	public void bdy() {
		System.out.println("Happy Birthday Vikram");
	}
}
