package com.vik.runner;

import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class MyInfoApplicationRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("MyInfoApplicationRunner.run()");
		System.out.println("Application Runner Arg Values :: ");
		// Get non option args 
		System.out.println("Non Optional Args :: "+args.getNonOptionArgs());
		// Get option args 
		System.out.println("Optinal Args :: ");
		Set<String> opArg = args.getOptionNames();
		opArg.forEach(names ->{ 
			System.out.println(names+" = "+args.getOptionValues(names));
			});
		
		

	}

}
