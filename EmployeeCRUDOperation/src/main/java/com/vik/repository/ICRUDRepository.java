package com.vik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vik.entity.Emplyee;

public interface ICRUDRepository extends JpaRepository<Emplyee, Integer> {

}
