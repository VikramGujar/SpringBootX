package com.vik.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.vik.entity.Doctor;

public interface IDoctorCrudRepo extends CrudRepository<Doctor, Integer>, PagingAndSortingRepository<Doctor, Integer> {

}
