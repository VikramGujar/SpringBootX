package com.vik.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vik.entity.Emplyee;
import com.vik.repository.ICRUDRepository;

@Service
public class CRUDServiceImpl implements ICRUDService {

	@Autowired
	ICRUDRepository rep;
	
	@Override
	public String saveEmp(Emplyee e) {
		Emplyee ep = rep.save(e);
		int id = ep.getId();
		return "Emplyee saved with ID : "+id;
	}

	@Override
	public List<Emplyee> getAllEmp() {
		return rep.findAll();
	}

	@Override
	public Emplyee getEmpById(Integer id) {
		Optional<Emplyee> emp = rep.findById(id);
		return null;
	}

	@Override
	public String editeEmp(Emplyee e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmp(Emplyee e) {
		// TODO Auto-generated method stub
		return null;
	}

}
