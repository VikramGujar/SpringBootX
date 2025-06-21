package com.vik.entity;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

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
@Table(name = "DOCTOR_SOFT_DELETE")
@SQLDelete(sql = "UPDATE DOCTOR_SOFT_DELETE SET STATUS='INACTIVE' WHERE ID=?") // For solf deletion
@SQLRestriction("STATUS<>'INACTIVE'")
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
	
	@Column(length = 20)
	String status = "ACTIVE";
	
	@NonNull
	@Column(name = "D_FEES")
	Double fees;
	
	
	
	
}
