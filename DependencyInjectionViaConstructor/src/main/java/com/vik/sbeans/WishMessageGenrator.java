package com.vik.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenrator {

	private LocalTime lt;

	@Autowired
	public WishMessageGenrator(LocalTime lt) {
		this.lt = lt;
	}
	
	public String getWishMessage(String user)
	{
		int hour = lt.getHour();
		
		if(hour<12)
		{
			return "Good Morning "+user+"!"+"Welcome to Spring Boot";
		}else if(hour<12)
		{
			return "Good Afternoon "+user+"!"+"Welcome to Spring Boot";
		}else if(hour<12)
		{
			return "Good Evining "+user+"!"+"Welcome to Spring Boot";
		}else {
			return "Good Night "+user+"!"+"Welcome to Spring Boot";
		}
	}
	
	
}
