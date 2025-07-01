package com.vik.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vik.entity.User;
import com.vik.repository.IUserManagementRepository;

@Service
public class MyUserDetailService implements UserDetailsService {

	@Autowired
	private IUserManagementRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		User user = repo.findByEmail( email);
		
		if(user == null)
		{
			 throw new UsernameNotFoundException("User not found");
		}

	    return user;
	}

}
