package com.vik.service;

import java.util.List;

import com.vik.entity.Employee;
import com.vik.entity.PhoneNumber;

public interface IAssociateMapSer {
	public String insertEmp(Employee emp);
	public String inserPhn(List<PhoneNumber> phn);
	public List<Employee> selectEmps();
	public String deleteEmp(int id);
}
