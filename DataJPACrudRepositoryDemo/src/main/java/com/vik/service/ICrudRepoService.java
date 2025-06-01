package com.vik.service;

import com.vik.entity.Doctor;

public interface ICrudRepoService {

	public String insertDoctor(Doctor doc);
	public long doctorCount();
	public String insertAllDoc(Iterable<Doctor> list);
}
