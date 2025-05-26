package com.vik.sbeans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("pd")
@ConfigurationProperties(prefix = "person.info")
@Data
public class PersonDetails {
	
	private String name;
	private int age;
	private String city;
	private String homeAddress;
	private String email;
	private String education;
	private String phonenumaber;
	ArrayList<String> nikNames;
	HashMap<String, String> favorites;
	String friends[];
	Details details;
}
