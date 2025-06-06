package com.vik.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vik.entity.Student;
import com.vik.entity.Teacher;
import com.vik.repository.IStudentRepository;
import com.vik.repository.ITeacherRepository;

@Service
public class IManyToManyServiceImpl implements IManyToManyService {

	@Autowired
	ITeacherRepository teach;
	@Autowired
	IStudentRepository stud;
	
	@Override
	public String addTeacherWithStudents(Teacher t) {
		
		Integer tid = teach.save(t).getTid();
		return "Teacher and his students saved with ID : "+tid;
	}

	@Override
	public String addStudentWithTeachers(Student s) {
		Integer sid = stud.save(s).getSid();
		return "Student and his teachers saved with ID : "+sid;
	}

}
