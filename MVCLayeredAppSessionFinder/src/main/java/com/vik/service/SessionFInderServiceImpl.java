package com.vik.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public class SessionFInderServiceImpl implements ISessionFinderService {

	@Override
	public String findSession() {
		
		LocalDate date = LocalDate.now();
		int month = date.getMonthValue();
		if(month > 1 && month < 6)
		{
			return "Summer session";
		}else if(month>5 && month <10)
		{
			return "Rainy Session";
		}else
		return "Winter Session";
	}

}
