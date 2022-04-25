package com.project.bankingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bankingsystem.model.Transaction;
import com.project.bankingsystem.repository.TransactionRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/")
public class TransactionController {
	
	@Autowired
	 private TransactionRepository transactionRepository;
	 
	 //get all employee
	 @GetMapping("/transactions")
	 public List<Transaction> getAllEmplyees(){
		 return transactionRepository.findAll();
	 }
	 
	//Create employee rest api
		 @PostMapping("/transactions")
		 public Transaction createTransaction(@RequestBody Transaction transaction) {
			 return transactionRepository.save(transaction);
		 }
}
