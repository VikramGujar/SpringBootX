package com.vik.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Table(name = "PHO_EMP_MAP")
@Entity
@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
public class PhoneNumber{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer phId;
	
	@NonNull
	Long num;
	
	@NonNull
	@Column(length = 20)
	String useType;
	
	@NonNull
	@Column(length = 20)
	String provider;
	
	@ManyToOne(targetEntity = Employee.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "EMPLOEE_ID", referencedColumnName = "EMP_ID")
	Employee emp;

	@Override
	public String toString() {
		return "PhoneNumbers [phId=" + phId + ", useType=" + useType + ", provider=" + provider + "]";
	}
	
	
	
}
