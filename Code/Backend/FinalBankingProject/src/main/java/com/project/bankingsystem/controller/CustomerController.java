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
import com.project.bankingsystem.model.Customer;
import com.project.bankingsystem.repository.CustomerRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	//get all employee
	 @GetMapping("/customers")
	 public List<Customer> getAllEmplyees(){
		 return customerRepository.findAll();
	 }
	 
	//Create employee rest api
	 @PostMapping("/customers")
	 public Customer createCustomer(@RequestBody Customer customer) {
		 return customerRepository.save(customer);
	 }
	 
	//delete rest api
	 @DeleteMapping("/customers/{id}")
	 public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Integer id){
		 Customer customer = customerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not"
		 		+ "exits with id:"+id ));
		 
		 customerRepository.delete(customer);
		 Map<String	, Boolean> response = new HashMap<String, Boolean>();
		 response.put("deleted",Boolean.TRUE);
		 return ResponseEntity.ok(response);
	 }
		 
		
}
