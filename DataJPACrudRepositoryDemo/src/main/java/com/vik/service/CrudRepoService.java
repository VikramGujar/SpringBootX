package com.vik.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vik.entity.Doctor;
import com.vik.repository.IDoctorCrudRepo;

@Component
public class CrudRepoService implements ICrudRepoService {

	@Autowired
	IDoctorCrudRepo docRepo;
	
	@Override
	public String InsertDoctor(Doctor doc) {
		Doctor doctor = docRepo.save(doc);
		return "Doctor record inserted with Id :"+doctor.getId();
	}

}
