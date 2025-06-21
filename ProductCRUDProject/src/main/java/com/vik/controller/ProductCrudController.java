package com.vik.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vik.entity.Product;
import com.vik.service.IProductCrudServ;

@Controller
@RestController
public class ProductCrudController {
	
	@Autowired
	IProductCrudServ ser;
	
	@GetMapping("/")
	public String greet() {
		return "Hello Java ";
	}
	
	@GetMapping("/products")
	public List<Product> getProducts(){
		return ser.getAllProducts();
	}
	
	

}
