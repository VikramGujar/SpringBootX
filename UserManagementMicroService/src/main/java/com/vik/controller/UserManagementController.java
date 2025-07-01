package com.vik.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vik.dto.Login;
import com.vik.entity.User;
import com.vik.service.IUserManagementService;
import com.vik.service.UserService;


@RestController
public class UserManagementController 
{

	@Autowired
	private IUserManagementService ser;
	
	@Autowired
	private UserService userSer;
	
	@GetMapping("/")
	public ResponseEntity<String> getHome()
	{
		ResponseEntity<String> res = new ResponseEntity<String>("Welcome To Spring Boot",HttpStatus.OK);
		return res;
	}
	
	@PostMapping("/auth/login")
	public ResponseEntity<String> loginUser(@RequestBody Login lng)
	{
		String msg = userSer.loginUser(lng);
		ResponseEntity<String> res = new ResponseEntity<String>(msg,HttpStatus.OK);
		return res;
	}
	
	@PostMapping("/auth/register")
	public ResponseEntity<String> registerUser(@RequestBody User user)
	{ 
		String msg = userSer.signin(user);
		ResponseEntity<String> res = new ResponseEntity<String>(msg,HttpStatus.CREATED);
		return res;
	}
	
	@GetMapping("/any/userById/{id}")
	public ResponseEntity<User> viewUserById(@PathVariable Integer id)
	{
		User user = ser.getUserById(id);
		ResponseEntity<User> res = new ResponseEntity<User>(user,HttpStatus.FOUND);
		return res;
	}
	
	@GetMapping("/any/allUser")
	public ResponseEntity<List<User>> showAllUsers() 
	{
		List<User> allUsers = ser.getAllUsers();
		ResponseEntity<List<User>> res = new ResponseEntity<List<User>>(allUsers,HttpStatus.OK);
		return res;
	}
	
	@DeleteMapping("/admin/delete/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable Integer id)
	{
		String msg = ser.removeUserById(id);
		ResponseEntity<String> res = new ResponseEntity<String>(msg,HttpStatus.OK);
		return res;
	}
	
	@DeleteMapping("/admin/deleteAll")
	public ResponseEntity<String> deleteAllUsers()
	{
		String msg = ser.removeAllUsers();
		ResponseEntity<String> res = new ResponseEntity<String>(msg,HttpStatus.OK);
		return res;
	}
	
	@PutMapping("/any/updateUser")
	public ResponseEntity<String> userUpdate(@RequestBody User user)
	{
		String msg = ser.updateUser(user);
		ResponseEntity<String> res = new ResponseEntity<String>(msg,HttpStatus.OK);
		return res;
	}
}
