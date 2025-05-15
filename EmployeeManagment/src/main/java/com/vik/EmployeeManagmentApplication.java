package com.vik;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vik.contoller.GetEmpByDegContoller;
import com.vik.model.Employee;

@SpringBootApplication
public class EmployeeManagmentApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(EmployeeManagmentApplication.class, args);
		GetEmpByDegContoller gebdc = ctx.getBean("getEmpByDegContoller",GetEmpByDegContoller.class);
		List<Employee> empList = new ArrayList<Employee>();
		try {
			
			empList =gebdc.getEmpByDegContoler("Java Developer", "React Developer", "Data Analyst");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		empList.forEach(System.out::println);
		
	}

}
