package com.project.bankingsystem.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bankingsystem.exception.ResourceNotFoundException;
import com.project.bankingsystem.model.Employee;
import com.project.bankingsystem.repository.EmployeeRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	 @Autowired
	 private EmployeeRepository employeeRepository;
	 
	 //get all employee
	 @GetMapping("/employees")
	 public List<Employee> getAllEmplyees(){
		 return employeeRepository.findAll();
	 }
	 
	 //Create employee rest api
	 @PostMapping("/employees")
	 public Employee createEmployee(@RequestBody Employee employee) {
		 return employeeRepository.save(employee);
	 }
	 
	 
	 //delete rest api
	 @DeleteMapping("/employees/{id}")
	 public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Integer id){
		 Employee employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not"
		 		+ "exits with id:"+id ));
		 
		 employeeRepository.delete(employee);
		 Map<String	, Boolean> response = new HashMap<String, Boolean>();
		 response.put("deleted",Boolean.TRUE);
		 return ResponseEntity.ok(response);
	 }
	 
	 
	 

}
