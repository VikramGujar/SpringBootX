package com.vik.runner;

import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vik.entity.Employee;
import com.vik.service.IJODAService;

@Component
public class JODARunner implements CommandLineRunner {
	
	@Autowired
	IJODAService srv;
	
	@Override
	public void run(String... args) throws Exception {
		Iterable<Employee> empIt = srv.getAllEmp();
		StreamSupport.stream(empIt.spliterator(), false).forEach(System.out::println);
	}

}
