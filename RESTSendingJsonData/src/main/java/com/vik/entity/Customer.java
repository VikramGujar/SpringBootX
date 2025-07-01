package com.vik.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	private Integer id;
	private String name;
	private String address;
	private List<String> prods;
	private Double bill;
	
}
