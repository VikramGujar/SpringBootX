package com.vik.service;

import java.util.List;

import com.vik.entity.Person;

public interface IJoinsService {

	public String addPerson(Person per);
	public List<Object[]> innerJoinData();
	public List<Object[]> rightJoinData();
	public List<Object[]> leftJoinData();
	public List<Object[]> fullJoinData();
}
