package com.vik.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

	@Override
	public String getDocById(int id) {
		
		Optional<Doctor> optDoc= docRepo.findById(id);
		if(optDoc.isPresent())
		{
			return id+" Doctor info is "+optDoc.get();
		}
		return "Doctor not found";
	}

	@Override
	public Iterable<Doctor> getAllDoc() {
		Iterable<Doctor> list = docRepo.findAll();
		return list;
	}

	@Override
	public Iterable<Doctor> getAllByIds(List<Integer> ids) {
		
		return docRepo.findAllById(ids);
	}

	@Override
	public String updateDoc(int id, String qlf, double fees) {
		Optional<Doctor> opt = docRepo.findById(id);
		if(opt.isPresent())
		{
			Doctor doc = opt.get();
			doc.setQualification(qlf);
			doc.setFees(fees);
			docRepo.save(doc);
			return "Doctor updated Successfully!";
		}
		return "No doctor found for update";
	}

}
