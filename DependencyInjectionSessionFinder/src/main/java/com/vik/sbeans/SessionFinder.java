package com.vik.sbeans;

import java.time.LocalDate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SessionFinder 
{
	// HAS-A
	@Autowired
	LocalDate lt;
	
	
	
	public SessionFinder() {
		System.out.println("Session Finder COnstructor");
	}



	// Business method 
	public String getSession()
	{
		System.out.println("Business Method getSession()");
		int month = lt.getMonthValue();
		
		if(month>3 && month<7)
		{
			return "Summer Session";
		}else if(month>6 && month<11)
		{
			return "Rainy Session";
		}else
		{
			return "Winter Session";
		}
	}
}
