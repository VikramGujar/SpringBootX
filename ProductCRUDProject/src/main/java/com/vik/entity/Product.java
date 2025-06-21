package com.vik.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NonNull
	@Column(length = 20)
	private String name;
	
	@NonNull
	@Column(length = 20)
	private String description;
	
	@NonNull
	private Double prize;
	
	@NonNull
	@Column(length = 20)
	private String catagary;

	@NonNull
	private Integer stock;
	@NonNull
	private Boolean isAvailable;
	
	@CreationTimestamp
	@Column(updatable = false)
	private Date addedOn;
	
	@UpdateTimestamp
	@Column(insertable = false)
	private Date updateOn;
	
}
