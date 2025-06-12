package com.vik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vik.entity.Players;

public interface CricketerOperationRepository extends JpaRepository<Players, Integer> {

}
