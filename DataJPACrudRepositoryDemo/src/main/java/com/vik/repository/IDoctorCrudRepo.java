package com.vik.repository;

import org.springframework.data.repository.CrudRepository;

import com.vik.entity.Doctor;

public interface IDoctorCrudRepo extends CrudRepository<Doctor, Integer> {

}
