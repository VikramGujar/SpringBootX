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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "EMP_CRUD")
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class Emplyee {
	
	@Id
	@SequenceGenerator(name = "sq", initialValue = 101, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NonNull
	@Column(length = 20)
	private String name;
	
	@NonNull
	@Column(length = 20)
	private String dep;
	
	@NonNull
	private Double sal;
	
	
	// Meta Data Properties
	
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDateTime insertTimeDate;
	
	@UpdateTimestamp
	@Column(insertable = false)
	private LocalDateTime updateTimeDate;
	
	@Version
	private Integer updateCount;
}
