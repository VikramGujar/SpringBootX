package com.vik.runner;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vik.entity.Employee;
import com.vik.entity.PhoneNumber;
import com.vik.service.IAssociateMapSer;

@Component
public class AssociateMappingTestRunner implements CommandLineRunner {

	@Autowired
	IAssociateMapSer ser;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		
		try {
			List<Employee> empList = ser.selectEmps();
			empList.forEach(e -> 
			{
				System.out.println(e);
				System.out.println("Phone Numbers are :: ");
				e.getNums().forEach(ph -> {
					System.out.println(ph.getNum());
				});
				System.out.println("===============================");
			});
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
