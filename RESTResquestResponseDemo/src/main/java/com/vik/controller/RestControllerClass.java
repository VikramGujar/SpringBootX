package com.vik.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/app")
public class RestControllerClass {

	
	
	@PutMapping("/insert")
	public ResponseEntity<String> creatEmp()
	{
		return new ResponseEntity<String>("Emplyee Created", HttpStatus.CREATED);
	}
	
	@GetMapping("/show")
	public ResponseEntity<String> getEmp()
	{
		return new ResponseEntity<String>("Employee Data", HttpStatus.OK);
	}
	
	@PostMapping("/updateEmp")
	public ResponseEntity<String> updateEmp()
	{
		return new ResponseEntity<String>("Emp updated",HttpStatus.OK);
	}
	
	@DeleteMapping("deleteEmp")
	public ResponseEntity<String> deleteEmp()
	{
		return new ResponseEntity<String>("Emplyee Deleted", HttpStatus.OK);
	}
	
	@PatchMapping("partialUpdate")
	public ResponseEntity<String> updateMail()
	{
		return new ResponseEntity<String>("Mail Updated",HttpStatus.OK);
	}
}
