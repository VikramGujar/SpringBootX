package com.vik.restcontroller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vik.entity.Customer;

@RestController
@RequestMapping("/customer-api")
public class SendingJSONController 
{
	@GetMapping("/cust")
	public ResponseEntity<Customer> getCustomer()
	{
		Customer cust = new Customer(101, "Vikram", "Pune", Arrays.asList("Pen", "Book", "Laptop", "Mouse" ), 45000.00);
		return new ResponseEntity<Customer>(cust,HttpStatus.OK);
	}
}
