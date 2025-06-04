package com.vik.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Table(name = "EMP_JODA")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee {
	
	@Id
	@SequenceGenerator(name = "EMP_JODA_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "EMP_JODA_seq", strategy = GenerationType.AUTO)
	Integer empId;
	
	@NonNull
	@Column(length = 20)
	String empName;
	
	@NonNull
	LocalDateTime bithDateTime;
	
	@CreationTimestamp
	LocalDate joiningDate;
	
	
	

}
