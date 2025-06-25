package com.vik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vik.entity.Doctor;
import com.vik.service.CrudRepoService;

@RestController()
public class CrudController {
	
	@Autowired
	CrudRepoService ser;

	@GetMapping("/")
	public Iterable<Doctor> getDoc()
	{
		return ser.getAllDoc();
	}
}
