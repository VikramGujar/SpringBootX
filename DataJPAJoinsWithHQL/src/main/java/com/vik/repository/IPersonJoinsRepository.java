package com.vik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vik.entity.Person;

public interface IPersonJoinsRepository extends JpaRepository<Person, Integer> {

}
