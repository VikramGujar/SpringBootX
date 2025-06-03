package com.vik.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.vik.entity.Doctor;

public interface ICrudRepoService {

	public String insertDoctor(Doctor doc);
	public long doctorCount();
	public String insertAllDoc(Iterable<Doctor> list);
	public String getDocById(int id);
	public Iterable<Doctor> getAllByIds(List<Integer> ids);
	public Iterable<Doctor> getAllDoc();
	public String updateDoc(int id, String qlf, double fees);
	public Iterable<Doctor> getAllDocSorted(boolean ord, String ...args);
	public Page<Doctor> getRecordByPage(int pageNo, int pageSize);
	public List<Doctor> getSortedDataByJpa(boolean sort, Doctor doc);
	public List<Doctor> getDoctorsByQualification(String qualification);
	public List<Doctor> getDoctorsBetweenFees(Double from, Double to);
}
