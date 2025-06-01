package com.vik.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "DOCTOR")
public class Doctor {

	@Id
	@SequenceGenerator(name="doc", sequenceName = "dec_seq", allocationSize = 1, initialValue = 100)
	@GeneratedValue(generator = "doc" ,strategy = GenerationType.SEQUENCE)
	int id;
	
	@NonNull
	@Column(name = "D_NAME")
	String name;
	
	@NonNull
	@Column(name = "D_QLF")
	String qualification;
	
	@NonNull
	@Column(name = "D_FEES")
	Double fees;
	
	
}
