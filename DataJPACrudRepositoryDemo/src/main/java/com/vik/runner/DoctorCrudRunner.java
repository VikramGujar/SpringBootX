package com.vik.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
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
		

			
			/*
			String msg = crudServ.insertDoctor(new Doctor("Vikram","MBBS",1000.00));
			System.out.println(msg);
			System.out.println("Total Doctors are : "+crudServ.doctorCount());
					
				
			Doctor doc1 = new Doctor("Raj", "MBBS", 1500.0);
			Doctor doc2 = new Doctor("Jay", "BHMS", 500.0);
			Doctor doc3 = new Doctor("Vir", "MD", 800.0);
			
			Doctor doc4 = new Doctor("Virat", "MDS", 1100.0);
			
			List<Doctor> docList = List.of(doc4);
			String msg = crudServ.insertAllDoc(docList);
			System.out.println(msg);
			
			String msg = crudServ.getDocById(101);
			System.out.println(msg);
			
			List<Integer> list = List.of(100,101,102,103,104,105,106,107);
			Iterable<Doctor> docList = crudServ.getAllByIds(list);
			docList.forEach(System.out::println);
			
			String msg = crudServ.updateDoc(107, "MBBS", 2000);
			System.out.println(msg);
			
		 */
			
		try {

		}catch (Exception e) {
			e.printStackTrace();
		}

	}// run method

}//class
