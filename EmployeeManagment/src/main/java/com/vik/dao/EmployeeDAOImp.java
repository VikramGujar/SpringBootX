package com.vik.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vik.model.Employee;

@Repository
public class EmployeeDAOImp implements IEmployeeDAO {

	@Autowired
	private DataSource ds;
	private static final String GET_ALL_EMP = "SELECT * FROM EMPLOYEEDATA WHERE DEG IN(?,?,?) ORDER BY DEG ";
	
	@Override
	public List<Employee> showEmployeeByDeg(String deg1, String deg2, String deg3) throws Exception {
		
		List<Employee> list = new ArrayList<Employee>();
		
		try(Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(GET_ALL_EMP)){
			ps.setString(1, deg1);
			ps.setString(2,deg2);
			ps.setString(3, deg3);		
			
			try(ResultSet rs = ps.executeQuery()){
				while(rs.next()) {
					Employee emp = new Employee();
					emp.setEmpid(rs.getInt(1));
					emp.setEmpname(rs.getString(2));
					emp.setDeg(rs.getString(3));
					emp.setSalary(rs.getDouble(4));
					emp.setDeptno(rs.getInt(5));
					
					list.add(emp);
				} 
			}
			
		} catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			throw e;
		}
		
		return list;
	}

}
