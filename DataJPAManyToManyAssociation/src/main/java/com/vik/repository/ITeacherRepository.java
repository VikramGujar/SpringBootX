package com.vik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vik.entity.Teacher;

public interface ITeacherRepository extends JpaRepository<Teacher, Integer> {

}
