package com.vik.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.vik.dto.Login;
import com.vik.entity.User;
import com.vik.repository.IUserManagementRepository;

@Service
public class UserService {

	@Autowired
	private IUserManagementRepository repo;
	
	@Autowired
	private PasswordEncoder encoder;
	
	@Autowired
	private AuthenticationManager manager;
	
	public String signin(User user)
	{
		user.setPassword(encoder.encode(user.getPassword()));
		 User save = repo.save(user);
		return "User registered with ID "+save.getId();
	}
	
	
	public String loginUser(Login lgn)
	{
		manager.authenticate(new UsernamePasswordAuthenticationToken(lgn.getEmail(), lgn.getPassword()));
		User us = repo.findByEmail(lgn.getEmail());
		return "Id "+us.getId()+" user Logged in successfully";
	}
	
	public List<User> getAllUsers()
	{
		return repo.findAll(); 
	}
}
