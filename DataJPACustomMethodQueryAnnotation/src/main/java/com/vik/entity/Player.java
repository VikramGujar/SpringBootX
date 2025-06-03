package com.vik.entity;

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

@Entity
@Table
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Player {
	
	@Id
	@SequenceGenerator(name = "pl", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "pl", strategy = GenerationType.SEQUENCE)
	Integer id;
	
	@NonNull
	String name;
	
	@NonNull
	String Natinalteam;
	
	@NonNull
	Integer jersyNo;
	
	@NonNull
	String iplTeam;

}
