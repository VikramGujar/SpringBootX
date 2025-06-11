package com.vik.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vik.model.Student;

@Controller
public class StudentDataController {

	@GetMapping("/")
	public String getHome()
	{
		return "home";
	}
	
	@GetMapping("/register")
	public String showForm()
	{
		/* 
		 Map<String, Object> map, @ModelAttribute("std") Student st

		Double sPercent = st.getSpercent();
		String result;
		if(sPercent>35)
		{
			result = "PASS";
		}else {
			result = "FAIL";
		}
		
		map.put("resultMsg", result);
				 */
		
		return "form";
	}
	
	@PostMapping("/register")
	public String fillFormData(Map<String, Object> map, @ModelAttribute("std") Student st)
	{

		Double sPercent = st.getSpercent();
		String result;
		if(sPercent>35)
		{
			result = "PASS";
		}else {
			result = "FAIL";
		}
		
		map.put("resultMsg", result);
		
		return "show_data";
	}
	
}
	

