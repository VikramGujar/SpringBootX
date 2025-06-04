package com.vik.service;

import com.vik.entity.Employee;

public interface IJODAService {

	public String addEmp(Employee emp);
	public Iterable<Employee> getAllEmp();
}
