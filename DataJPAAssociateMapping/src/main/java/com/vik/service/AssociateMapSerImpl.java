package com.vik.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vik.entity.Employee;
import com.vik.entity.PhoneNumber;
import com.vik.repository.IAssociateMapRepo;
import com.vik.repository.IAssociateMapRepoPho;

@Service
public class AssociateMapSerImpl implements IAssociateMapSer {

	@Autowired
	IAssociateMapRepo assMapRepo;
	@Autowired
	IAssociateMapRepoPho assMapRepoPhn;
	
	@Override
	public String insertEmp(Employee emp) {
		int id = assMapRepo.save(emp).getEmpId();
		return "Emplyee details and Associate phone numbers saved with ID :: "+id;
	}

	@Override
	public String inserPhn(List<PhoneNumber> phn) {
		Integer phns = assMapRepoPhn.saveAll(phn).size();
		return phns+" phone numbers are saved";
	}

	@Override
	public List<Employee> selectEmps() {
		
		return assMapRepo.findAll();
	}

	@Override
	public String deleteEmp(int id) {
		Optional<Employee> byId = assMapRepo.findById(id);
		
		if(byId.isPresent())
		{
			Employee e = byId.get();
			assMapRepo.delete(e);
			return "Record with ID:"+id+" deleted";
		}
		return "Invalid ID";
	}

}
