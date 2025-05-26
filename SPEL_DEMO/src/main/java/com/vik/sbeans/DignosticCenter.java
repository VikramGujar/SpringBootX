package com.vik.sbeans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("dc")
public class DignosticCenter {

	@Value("${digo.name}")
	private String name;
	@Value("${digo.age}")
	private int age;
	@Value("${digo.mri}")
	private float mriPrize;
	@Value("${digo.ctscan}")
	private float ctScanPrize;
	@Value("${digo.dibetic}")
	private float dibeticTestPrize;
	@Value("${digo.bp}")
	private float bpTestPrize;
	
	
}
