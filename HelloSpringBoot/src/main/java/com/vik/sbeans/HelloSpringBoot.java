package com.vik.sbeans;

import org.springframework.stereotype.Component;

@Component("hsb")
public class HelloSpringBoot 
{
	public void greeting()
	{
		System.out.println("Hello Spring Boot!!!");
	}
}
