package com.vik.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vik.dao.EmployeeDAOImp;
import com.vik.model.Employee;

@Service
public class GetEmpByDegService {

	@Autowired
	EmployeeDAOImp ied;
	
	public List<Employee> getEmpByDeg(String deg1, String deg2, String deg3)throws Exception {

		return ied.showEmployeeByDeg(deg1, deg2, deg3);
	}
}
