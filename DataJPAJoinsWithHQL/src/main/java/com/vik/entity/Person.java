package com.vik.entity;

import java.util.List;

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


@Table(name = "PERSON_JOIN")
@Entity
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class Person {

	@Id
	@SequenceGenerator(name = "perGen", initialValue = 100, allocationSize = 1)
	@GeneratedValue(generator = "perGen", strategy = GenerationType.SEQUENCE)
	private Integer pid;
	
	@NonNull
	@Column(length = 20)
	private String pName;
	
	@NonNull
	private Integer pAge;
	
	@OneToMany(targetEntity = Phones.class, cascade = CascadeType.ALL, mappedBy = "person")
	private List<Phones> pPhones;
}
