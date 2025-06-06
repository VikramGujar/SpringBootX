package com.vik.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Table(name = "EMP_PHO_MAP")
@Entity
@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	@SequenceGenerator(name = "gen", initialValue = 1110, allocationSize = 1)
	@GeneratedValue(generator = "gen", strategy = GenerationType.SEQUENCE)
	@Column(name = "EMP_ID")
	Integer empId;
	
	@NonNull
	@Column(length = 20)
	String fName;
	
	@NonNull
	@Column(length = 20)
	String lName;
	
	@NonNull
	@Column(length = 20)
	String city;
	
	@OneToMany(targetEntity = PhoneNumber.class, cascade = CascadeType.ALL, mappedBy ="emp")
	Set<PhoneNumber> nums;

	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fName=" + fName + ", lName=" + lName + ", city=" + city + "]";
	}
	
	
	
}
