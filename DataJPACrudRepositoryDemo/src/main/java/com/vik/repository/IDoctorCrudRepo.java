package com.vik.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.vik.entity.Doctor;

public interface IDoctorCrudRepo extends CrudRepository<Doctor, Integer>, PagingAndSortingRepository<Doctor, Integer>, JpaRepository<Doctor, Integer> {

	public List<Doctor> findByQualification(String qualification);
	public List<Doctor> findByFeesBetween(Double from, Double to);
	
}
