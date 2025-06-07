package com.vik.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vik.entity.Teacher;
import com.vik.service.IManyToManyService;

@Component
public class ManyToManyTestRunner implements CommandLineRunner {

	@Autowired
	IManyToManyService ser;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		Student s1 = new Student("Ravi");
		Student s2 = new Student("Viky");
		Student s3 = new Student("Mavi");
		Student s4 = new Student("Ram");
		
		Teacher t1 = new Teacher("Nateaj", "Spring");
		Teacher t2 = new Teacher("Ravi Shankar", "Java");
		Teacher t3 = new Teacher("Mahipathi", "ADV Java");
		Teacher t4 = new Teacher("Kishore", "C lang");
		
		s1.setTeachers(Arrays.asList(t1,t2,t3));
		s2.setTeachers(Arrays.asList(t1,t4));
		s3.setTeachers(Arrays.asList(t1,t2));
		s4.setTeachers(Arrays.asList(t1,t2,t3,t4));
		
		t1.setStudents(Arrays.asList(s1,s2,s3,s4));
		t2.setStudents(Arrays.asList(s1,s4));
		t3.setStudents(Arrays.asList(s1,s2));
		t4.setStudents(Arrays.asList(s2,s3,s4));
		
		String msg1 = ser.addStudentWithTeachers(s1);
		System.out.println(msg1);
		String msg2 = ser.addStudentWithTeachers(s2);
		System.out.println(msg2);
		String msg3 = ser.addStudentWithTeachers(s3);
		System.out.println(msg3);
		String msg4 = ser.addStudentWithTeachers(s4);
		System.out.println(msg4);
		
		String msg5 = ser.addTeacherWithStudents(t1);
		System.out.println(msg5);
		String msg6 = ser.addTeacherWithStudents(t2);
		System.out.println(msg6);
		String msg7 = ser.addTeacherWithStudents(t3);
		System.out.println(msg7);
		String msg8 = ser.addTeacherWithStudents(t4);
		System.out.println(msg8);
		*/
		
		
		Iterable<Teacher> allTeachers = ser.getAllTeachers();
		allTeachers.forEach(t -> {
			System.out.println(t);
			t.getStudents().forEach(System.out::println);
		});
		
		
	}

}
