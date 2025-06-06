package com.vik.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vik.entity.Person;

public interface IPersonJoinsRepository extends JpaRepository<Person, Integer> {

	@Query("SELECT per.pid, per.pName, per.pAge, ph.phId, ph.useType, ph.phBrand "
			+ "FROM Person per inner join per.pPhones ph")
	public List<Object[]> showPersonAndPhonesInnerJoin();
	
	@Query("select pid, pName, pAge, phId, useType, phBrand from "
			+ "Person per right join per.pPhones ph")
	public List<Object[]> showPersonAndPhonesRightJoin();
	
	
	@Query("select pid, pName, pAge, phId, useType, phBrand from "
			+ "Person per left join pPhones")
	public List<Object[]> showPersonAndPhonesLeftJoin();
	
	@Query("select pid, pName, pAge, phId, useType, phBrand from "
			+ "Person per full join pPhones")
	public List<Object[]> showPersonAndPhonesFullJoin();
	
	
}
