package com.vik.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vik.entity.User;
import com.vik.repository.IUserManagementRepository;

@Service
public class UserManagementServiceImpl implements IUserManagementService 
{

	@Autowired
	IUserManagementRepository repo;


	@Override
	public String addUser(User user) 
	{
		User savedUser = repo.save(user);
		
		return "User registered with ID :"+savedUser.getId();
	}

	
	
	@Override
	public User getUserById(Integer id) 
	{
		Optional<User> opObj = repo.findById(id);
		
		if(opObj.isPresent())
		{
			return opObj.get();
		}
		throw new IllegalArgumentException("Invalid ID");
	}

	
	
	@Override
	public List<User> getAllUsers() 
	{
		List<User> all = repo.findAll();
		
		return all;
	}

	
	
	@Override
	public String removeUserById(Integer id) 
	{
		Optional<User> optionalObj = repo.findById(id);
		
		if(optionalObj.isPresent())
		{
			repo.deleteById(id);
			return "User with "+id+" ID is deleted";
		}
		throw new IllegalArgumentException("Invalid ID");
	}

	
	
	@Override
	public String removeAllUsers() {
		repo.deleteAll();
		
		return "All records are deleted";
	}

	@Override
	public String updateUser(User user) 
	{
		User userData = repo.findById(user.getId()).orElseThrow(() -> new IllegalArgumentException("Invalid ID"));
		
		BeanUtils.copyProperties(user, userData);
		
		repo.save(userData);
		
		return "Id "+user.getId()+" user updated";
	}

}
