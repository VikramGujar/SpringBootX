package com.vik.model;

import lombok.Data;

@Data
public class Emplyee {

	private Integer empid;
	private String empname;
	private String emprole = "Developer";
	private Integer empdepNo;
	private Double empsal;
}
