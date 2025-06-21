package com.vik.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.vik.entity.Doctor;
import com.vik.service.CrudRepoService;
import com.vik.service.ICrudRepoService;

@Component
public class DoctorCrudRunner implements CommandLineRunner {


	@Autowired
	ICrudRepoService crudServ;



	@Override
	public void run(String... args) throws Exception {
		
			
		try {
			
			crudServ.getAllDoc().forEach(System.out::println);;
			

		}catch (Exception e) {
			e.printStackTrace();
		}

	}// run method

}//class
