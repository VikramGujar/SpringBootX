package com.vik.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestForwarding {

	@RequestMapping("/")
	public String methodOne( Map<String, Object> map)
	{
		System.out.println(map.getClass());
		return "forward:home";
	}
	
	@RequestMapping("/home")
	public String methodTwo()
	{
		
		return "home";
	}
}
