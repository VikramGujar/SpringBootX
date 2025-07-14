package com.vik.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.vik.document.Employee;

public interface IMongoDemoRepository extends MongoRepository<Employee, String> {

	// Finder methods of Spring Data MongoDB 
	
	// By Company 
    public List<Employee> findByCompany(String company);
    
    // Search By Name 
    public List<Employee> findByNameContainingIgnoreCase(String keyword);
    
    // Query method
    @Query(fields = "{id:0,name:1, designation:1}", value = "{company:?0}")
    public List<Employee> getEmpNameNCompanyByCompany(String company);
}
