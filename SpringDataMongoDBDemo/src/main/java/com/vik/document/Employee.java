package com.vik.document;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
@NoArgsConstructor
public class Employee {

	@Id
	private String id;
	@NonNull
	private String name;
	@NonNull
	private String designation;
	@NonNull
	private String company;
}
