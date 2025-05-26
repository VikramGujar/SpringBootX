package com.vik.sbeans;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "my.info")
public class MyInfo {

	private String name;
	private int age;
	private String address;
	private long number;
	private String degree;
	private String knownCities[];
	private ArrayList<String> friends;
	private HashMap<String, String> favorites;
	private Details details;

	
}
