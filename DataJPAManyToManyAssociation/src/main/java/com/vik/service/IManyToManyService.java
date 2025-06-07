package com.vik.service;

import com.vik.entity.Student;
import com.vik.entity.Teacher;

public interface IManyToManyService {

	public String addTeacherWithStudents(Teacher t);
	public String addStudentWithTeachers(Student s);
	public Iterable<Teacher> getAllTeachers();
}
