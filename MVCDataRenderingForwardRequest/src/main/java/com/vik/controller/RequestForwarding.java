package com.vik.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.support.BindingAwareConcurrentModel;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class RequestForwarding {

	@RequestMapping("/")
	public String methodOne( Map<String, Object> map, HttpServletRequest req)
	{
		req.setAttribute("date", "09-06-25");
		System.out.println(map.getClass());
		return "forward:home";
	}
	
	// In forward request both methods use same HttpServletRequest object 
	// You can use values from one HttpServletRequest object to another 
	@RequestMapping("/home")
	public String methodTwo(HttpServletRequest req)
	{
		System.out.println(req.getAttribute("date"));
		return "home";
	}
	
	@RequestMapping("/show")
	public String showMsg()
	{
		
		return "redirect:showMessage?p1= Vikram &p2= Gujar";
	}
	
	@RequestMapping("/showMessage")
	public String show(String p1, String p2)
	{
		Map< String, Object> mp = new BindingAwareConcurrentModel();
		
		mp.put("fName", p1);
		mp.put("lName", p2);
		return "show";
	}
	
	
}
