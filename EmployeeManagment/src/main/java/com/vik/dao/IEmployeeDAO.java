package com.vik.dao;


import java.util.List;

import com.vik.model.Employee;

public interface IEmployeeDAO {

	public List<Employee> showEmployeeByDeg(String deg1, String deg2, String deg3)throws Exception;
}
