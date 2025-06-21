package com.vik.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

@Controller
public class SchedulingPeriodOfTime {

	
	@Scheduled(cron = "1/20 * * * * *")
	public void sec()
	{
		System.out.println("Every 20th sec");
	}
	
	@Scheduled(cron = "0 1/5 * * * *")
	public void min()
	{
		System.out.println("Every 5th min");
	}
	
	@Scheduled(cron = "0 0 1/23 * * *")
	public void hour()
	{
		System.out.println("Every 23th hour");
	}
}
