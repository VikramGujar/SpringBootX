package com.vik.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vik.entity.Product;
import com.vik.repository.IProductCrudRepo;

@Service
public class ProductCrudServImpl implements IProductCrudServ {

	@Autowired
	IProductCrudRepo repo;
	
	@Override
	public List<Product> getAllProducts() {
		
		return repo.findAll();
	}

}
