package com.vik.service;

import java.util.List;

import com.vik.entity.Emplyee;

public interface ICRUDService {

	public String saveEmp(Emplyee e);
	public List<Emplyee> getAllEmp();
	public Emplyee getEmpById(Integer id);
	public String editeEmp(Emplyee e);
	public String deleteEmp(Emplyee e);
}
