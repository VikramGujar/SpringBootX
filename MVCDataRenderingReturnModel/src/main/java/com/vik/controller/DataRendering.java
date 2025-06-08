package com.vik.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataRendering {

	
	@RequestMapping("/home")
	public Model showMsg()
	{
		
		Model model = new BindingAwareModelMap();
		model.addAttribute("Name", "Vikram");
		model.addAttribute("Age", new Random().nextInt(30));	
		return model;
	}
}
