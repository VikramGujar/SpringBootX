package com.vik.service;

import java.util.List;

import com.vik.document.Employee;

public interface IMongoDemoService {

    // Add a new employee
	public String addEmployee(Employee emp);

    // Get all employees
	public List<Employee> getAllEmployees();

    // Get an employee by ID
	public Employee getEmployeeById(String id);

    // Update an existing employee
	public String updateEmployee(Employee emp);

    // Delete an employee by ID
	public String deleteEmployeeById(String id);

    // Get employees by company name (formerly category)
	public List<Employee> getEmployeesByCompany(String company);

    // Search employees by partial or full name
	public List<Employee> searchByName(String keyword);
	
	// Get emp name and des by id 
	public List<Employee> getNameAndDes(String company);
}
