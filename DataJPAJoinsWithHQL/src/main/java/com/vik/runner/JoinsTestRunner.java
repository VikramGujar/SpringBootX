package com.vik.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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
		
		List<Object[]> innerJoinData = ser.innerJoinData();
		System.out.println("===-Inner Join Data-===");
		innerJoinData.forEach(data -> {
			System.out.println(Arrays.toString(data));
		});
		
		List<Object[]> rightJoinData = ser.rightJoinData();
		System.out.println("===-Right Join Data-===");
		rightJoinData.forEach(data -> {
			System.out.println(Arrays.toString(data));
		});
		
		List<Object[]> leftJoinData = ser.leftJoinData();		
		System.out.println("===-Left Join Data-===");
		leftJoinData.forEach(data -> {
			System.out.println(Arrays.toString(data));
		});
		
		List<Object[]> fullJoinData = ser.fullJoinData();		
		System.out.println("===-Full Join Data-===");
		fullJoinData.forEach(data -> {
			System.out.println(Arrays.toString(data));
		});

		
		
		
		
		
		
	}

}
