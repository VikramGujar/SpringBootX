package com.vik.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Table
public class BanckAccount {

	@Id
	@SequenceGenerator(name = "bnkacc", sequenceName = "BackAccount_Seq", initialValue = 100000000, allocationSize = 1)
	@GeneratedValue(generator = "bnkacc", strategy = GenerationType.SEQUENCE)
	Long acNumber;
	
	@Column(length = 20)
	@NonNull
	String accountHolderName;
	
	@Column(length = 20)
	@NonNull
	String cityName;
	
	@NonNull
	Double accountBalence;
	
	@Column(length = 20)
	@NonNull
	String bankName;
	
	// Versioning 
	@Version
	Integer updateCount;
	
	//Timestamping 
	@CreationTimestamp
	LocalDateTime accCreatedOn;
	
	@UpdateTimestamp
	LocalDateTime accLastUpdatedOn;
	
	
	
	
}
