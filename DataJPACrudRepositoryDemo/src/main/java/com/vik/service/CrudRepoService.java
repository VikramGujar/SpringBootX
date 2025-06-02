package com.vik.service;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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

	@Override
	public Iterable<Doctor> getAllDocSorted(boolean ord, String... args) {
		
		Sort sort = Sort.by(ord?Sort.Direction.ASC:Sort.Direction.DESC, args);
		return docRepo.findAll(sort);

	}

	@Override
	public Page<Doctor> getRecordByPage(int pageNo, int pageSize) {
		PageRequest pg = PageRequest.of(pageNo, pageSize);
		Page<Doctor> pgDoc = docRepo.findAll(pg);
		return pgDoc;
	}

}
