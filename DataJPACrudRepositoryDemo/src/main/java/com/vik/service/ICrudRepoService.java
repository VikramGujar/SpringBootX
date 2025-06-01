package com.vik.service;

import java.util.List;

import com.vik.entity.Doctor;

public interface ICrudRepoService {

	public String insertDoctor(Doctor doc);
	public long doctorCount();
	public String insertAllDoc(Iterable<Doctor> list);
	public String getDocById(int id);
	public Iterable<Doctor> getAllByIds(List<Integer> ids);
	public Iterable<Doctor> getAllDoc();
	public String updateDoc(int id, String qlf, double fees);
}
