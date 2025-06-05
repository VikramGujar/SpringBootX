package com.vik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vik.entity.Employee;

public interface IAssociateMapRepo extends JpaRepository<Employee, Integer> {

}
