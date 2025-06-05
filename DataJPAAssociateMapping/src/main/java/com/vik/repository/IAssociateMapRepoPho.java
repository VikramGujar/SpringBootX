package com.vik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vik.entity.PhoneNumber;

public interface IAssociateMapRepoPho extends JpaRepository<PhoneNumber, Integer> {

}
