package com.vik.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vik.document.Employee;
import com.vik.repository.IMongoDemoRepository;

@Service
public class MongoDemoServiceImpl implements IMongoDemoService {

    @Autowired
    private IMongoDemoRepository repo;

    @Override
    public String addEmployee(Employee emp) {
        Employee savedEmp = repo.save(emp);
        return "Employee saved with ID: " + savedEmp.getId();
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    @Override
    public Employee getEmployeeById(String id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee Not Found with ID: " + id));
    }

    @Override
    public String updateEmployee(Employee emp) {
        Employee existing = repo.findById(emp.getId())
                .orElseThrow(() -> new RuntimeException("Employee Not Found with ID: " + emp.getId()));
        
        existing.setName(emp.getName());
        existing.setDesignation(emp.getDesignation());
        existing.setCompany(emp.getCompany());
        
        repo.save(existing);
        return "Employee updated: " + existing.getId();
    }

    @Override
    public String deleteEmployeeById(String id) {
        if (!repo.existsById(id)) {
            throw new RuntimeException("Employee Not Found with ID: " + id);
        }
        repo.deleteById(id);
        return "Employee with ID " + id + " deleted.";
    }

    @Override
    public List<Employee> getEmployeesByCompany(String company) {
        return repo.findByCompany(company);
    }

    @Override
    public List<Employee> searchByName(String keyword) {
        return repo.findByNameContainingIgnoreCase(keyword);
    }

	@Override
	public List<Employee> getNameAndDes(String company) {
		return repo.getEmpNameNCompanyByCompany(company);
	}
}
