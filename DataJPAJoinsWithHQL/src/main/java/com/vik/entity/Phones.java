package com.vik.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Table(name = "PHONE_JOIN")
@Entity
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class Phones {

	@Id
	@SequenceGenerator(name = "phGen", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "phGen", strategy = GenerationType.SEQUENCE)
	private Integer phId;
	
	@NonNull
	@Column(length = 20)
	private String useType;
	
	@NonNull
	@Column(length = 20)
	private String phBrand;
	
	@ManyToOne(targetEntity = Person.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "PERSON_IDS", referencedColumnName = "pid")
	private Person person;
}
