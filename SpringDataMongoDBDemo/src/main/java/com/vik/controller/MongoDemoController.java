package com.vik.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.vik.document.Employee;
import com.vik.service.IMongoDemoService;

@RestController
@RequestMapping("/api/emp")
public class MongoDemoController {

    @Autowired
    private IMongoDemoService ser;

    // Create
    @PostMapping
    public ResponseEntity<String> registerEmployee(@RequestBody Employee emp) {
        String msg = ser.addEmployee(emp);
        return new ResponseEntity<>(msg, HttpStatus.CREATED);
    }

    // Read All
    @GetMapping
    public ResponseEntity<List<Employee>> showAllEmployees() {
        List<Employee> allEmployees = ser.getAllEmployees();
        return new ResponseEntity<>(allEmployees, HttpStatus.OK);
    }

    // Read by ID
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable String id) {
        Employee emp = ser.getEmployeeById(id);
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }

    // Update
    @PutMapping
    public ResponseEntity<String> updateEmployee(@RequestBody Employee emp) {
        String msg = ser.updateEmployee(emp);
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable String id) {
        String msg = ser.deleteEmployeeById(id);
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

    // Search by company
    @GetMapping("/company/{company}")
    public ResponseEntity<List<Employee>> getEmployeesByCompany(@PathVariable String company) {
        List<Employee> list = ser.getEmployeesByCompany(company);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    // Search by name keyword
    @GetMapping("/search/{name}")
    public ResponseEntity<List<Employee>> searchByName(@PathVariable String name) {
        List<Employee> list = ser.searchByName(name);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    
    @GetMapping("/namedes/{company}")
    public ResponseEntity<List<Employee>> showEmpNameAndDes(@PathVariable String company) {
        List<Employee> list = ser.getNameAndDes(company);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
