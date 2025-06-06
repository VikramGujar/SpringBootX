package com.vik.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vik.entity.Person;
import com.vik.repository.IPersonJoinsRepository;
import com.vik.repository.IPhonesJoinsRepository;

@Service
public class JoinsServiceImpl implements IJoinsService {


	@Autowired
	IPersonJoinsRepository perRepo;
	
	@Autowired
	IPhonesJoinsRepository phRepo;

	
	@Override
	public String addPerson(Person per) {
		
		Person per1 = perRepo.save(per);
		return "Person and phones data saved with ID : "+per1.getPid();
	}

	@Override
	public List<Object[]> innerJoinData() {
		// TODO Auto-generated method stub
		return perRepo.showPersonAndPhonesInnerJoin();
	}

	@Override
	public List<Object[]> rightJoinData() {
		// TODO Auto-generated method stub
		return perRepo.showPersonAndPhonesRightJoin();
	}

	@Override
	public List<Object[]> leftJoinData() {
		// TODO Auto-generated method stub
		return perRepo.showPersonAndPhonesLeftJoin();
	}

	@Override
	public List<Object[]> fullJoinData() {
		// TODO Auto-generated method stub
		return perRepo.showPersonAndPhonesFullJoin();
	}

}
