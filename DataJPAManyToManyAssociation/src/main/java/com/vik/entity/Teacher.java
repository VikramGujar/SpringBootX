package com.vik.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Table(name = "TEACHER_MTM")
@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer tid;
	
	@NonNull
	@Column(length = 20)
	private String tName;
	
	@NonNull
	@Column(length = 20)
	private String tSubject;
	
	@ManyToMany(targetEntity = Student.class,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "TEACHER_STUDENT_MTM", 
	joinColumns = @JoinColumn(name="TEACHER_ID", referencedColumnName = "tid"),// Owning side 
	inverseJoinColumns = @JoinColumn(name="STUDENT_ID", referencedColumnName = "sid")) // Non owning side 
	private List<Student> students;
}
