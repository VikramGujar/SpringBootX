package com.vik.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vik.model.Emplyee;

@Controller
public class EmployeeDataController {

	@GetMapping("/")
	public String getHome() {
		return "home";
	}
	
	@GetMapping("/register")
	public String getForm(@ModelAttribute("emp") Emplyee ep) {
		ep.setEmpname("Vikram");
		System.out.println(ep);
		return "register_form";
	}
	
	@PostMapping("/register")
	public String saveFormData(Map<String, Object> map, @ModelAttribute("emp") Emplyee ep)
	{
		System.out.println(ep);
		return "show_data";
	}
	
}
