package com.vik.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vik.entity.Doctor;
import com.vik.service.ICrudRepoService;

@Component
public class DoctorCrudRunner implements CommandLineRunner {

	@Autowired
	ICrudRepoService crudServ;
	@Override
	public void run(String... args) throws Exception {
		
		try{
			
			String msg = crudServ.InsertDoctor(new Doctor("Vikram","MBBS",1000.00));
			System.out.println(msg);
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
