package com.vik.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vik.entity.Doctor;
import com.vik.repository.IDoctorCrudRepo;

@Component
public class CrudRepoService implements ICrudRepoService {

	@Autowired
	IDoctorCrudRepo docRepo;
	
	@Override
	public String insertDoctor(Doctor doc) {
		Doctor doctor = docRepo.save(doc);
		return "Doctor record inserted with Id :"+doctor.getId();
	}

	@Override
	public long doctorCount() {
		long count = docRepo.count();
		return count;
	}

	@Override
	public String insertAllDoc(Iterable<Doctor> list) {
		
		ArrayList<Doctor> savedList =(ArrayList<Doctor>)docRepo.saveAll(list);
		long count = savedList.stream().count();
		return count+" Doctor's Inserted with following data "+savedList;
	}

}
