package com.vik.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vik.service.ISessionFinderService;

@Controller
public class SessionFinderController {

	@Autowired
	ISessionFinderService ser;
	
	@RequestMapping({"/", "/home"})
	public String home()
	{
		return "welcome";
	}
	
	@RequestMapping("/session")
	public String getSession(Map<String, Object> map) {
		
		String result = ser.findSession();
		map.put("resultSession", result);
		return "result";
	}
}
