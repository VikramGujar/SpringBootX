package com.vik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vik.entity.Product;

@Repository
public interface IProductCrudRepo extends JpaRepository<Product, Integer> {

}
