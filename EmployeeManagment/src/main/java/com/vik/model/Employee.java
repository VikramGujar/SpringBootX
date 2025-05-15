package com.vik.model;

import lombok.Data;

// @Data annotation of Lombok API will give getter, setter, hashcode, equals and toString automatically  
@Data
public class Employee {
	
	private Integer empid;
	private String empname;
	private String deg;
	private Double salary;
	private Integer deptno;
	private Double grossSalary;
	private Double netSalary;
	
		
}
