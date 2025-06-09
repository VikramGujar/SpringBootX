package com.vik.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.support.BindingAwareConcurrentModel;
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
