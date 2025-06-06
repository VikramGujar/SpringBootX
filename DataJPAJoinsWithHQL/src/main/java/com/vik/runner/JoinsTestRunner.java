package com.vik.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vik.entity.Person;
import com.vik.entity.Phones;
import com.vik.service.IJoinsService;

@Component
public class JoinsTestRunner implements CommandLineRunner {

	@Autowired
	IJoinsService ser;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		Person per = new Person("Ranjeet", 25);
		
		Phones ph1 = new Phones("Personal", "Realme");
		ph1.setPerson(per);
		Phones ph2 = new Phones("Business", "Apple");
		ph2.setPerson(per);
		
		per.setPPhones(Arrays.asList(ph1,ph2));
		
		String msg = ser.addPerson(per);
		System.out.println(msg);
		*/
		
		
	}

}
