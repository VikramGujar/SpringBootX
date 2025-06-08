package com.vik.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RenderData {
	
	
	@RequestMapping("/")
	public String showHome() {
		return "home";
	}

	@RequestMapping("/show")
	public String showData(Map<String, String> map) {
		
		// DispatcherServlet creates object for Map parameter
		// Object of class BindingAwareModelMap
		// This object is Shared Memory with request scope 
		// This request scope is accessible from view component 
		System.out.println("Class name of Map :: "+map.getClass());
		
		// add data to map object for rendering 
		map.put("atr1", "Love");
		map.put("atr2", "Java");
		
		return "show";
	}
}
