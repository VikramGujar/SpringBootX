package com.vik.service;

import java.util.List;

import com.vik.entity.User;

public interface IUserManagementService {

	public String addUser(User user);
	
	public User getUserById(Integer id);
	
	public List<User> getAllUsers();
	
	public String removeUserById(Integer id);
	
	public String removeAllUsers();
	
	public String updateUser(User user);
	
}
