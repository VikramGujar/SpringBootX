package com.vik.sbeans;


import org.springframework.stereotype.Component;

@Component
public final class AllRounder implements ICricketer {

	@Override
	public String batting(String cricketer) {
		// TODO Auto-generated method stub
		return cricketer+" can bat well";
	}

	@Override
	public String bowling(String cricketer) {
		// TODO Auto-generated method stub
		return cricketer+" can bowl well";
	}

	@Override
	public String fielding(String cricketer) {
		// TODO Auto-generated method stub
		return cricketer+" can filed well";
	}

}
