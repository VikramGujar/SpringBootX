package com.vik.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vik.entity.Employee;
import com.vik.repository.IJONARepository;

@Service
public class JODAServiceImpl implements IJODAService {

	@Autowired
	IJONARepository joda;
	
	@Override
	public String addEmp(Employee emp) {
		// Insert record and get ID
		int id = joda.save(emp).getEmpId();
		// Return MSG
		return "Employee inserted with ID : "+id;
	}

	@Override
	public Iterable<Employee> getAllEmp() {
		
		return joda.findAll();
	}

}
