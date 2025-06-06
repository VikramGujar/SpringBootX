package com.vik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vik.entity.Student;

public interface IStudentRepository extends JpaRepository<Student, Integer> {

}
