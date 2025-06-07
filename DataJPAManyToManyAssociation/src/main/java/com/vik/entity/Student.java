package com.vik.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Table(name = "STUDENT_MTM")
@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sid;
	
	@NonNull
	@Column(length = 20)
	private String sName;
	
	@ManyToMany(targetEntity = Teacher.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "students")
	private List<Teacher> teachers;

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + "]";
	}
	
	
	
}
