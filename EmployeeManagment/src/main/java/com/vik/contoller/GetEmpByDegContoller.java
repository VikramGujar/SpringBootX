package com.vik.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.vik.model.Employee;
import com.vik.service.GetEmpByDegService;

@Controller
public class GetEmpByDegContoller {
	
	@Autowired 
	GetEmpByDegService gebds;
	
	public List<Employee> getEmpByDegContoler(String deg1, String deg2, String deg3) throws Exception{
		return gebds.getEmpByDeg(deg1, deg2, deg3);
	}
}
