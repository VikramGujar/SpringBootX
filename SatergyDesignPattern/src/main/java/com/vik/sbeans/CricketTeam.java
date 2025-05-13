package com.vik.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ct")
public class CricketTeam {

	@Autowired
	@Qualifier("player")
	ICricketer ic;
	
	public void play(String player)
	{
		System.out.println(ic.batting(player));
		System.out.println(ic.bowling(player));
		System.out.println(ic.fielding(player));
	}
}
