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
import com.project.bankingsystem.model.BankAccount;
import com.project.bankingsystem.repository.BankAccountRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/")
public class BankAccountController {
	
	
	@Autowired
	 private BankAccountRepository bankAccountRepository;
	 
	 //get all bankAccount
	 @GetMapping("/bank-accounts")
	 public List<BankAccount> getAllEmplyees(){
		 return bankAccountRepository.findAll();
	 }
	 
	 
	//Create bankAccount rest api
	 @PostMapping("/bank-accounts")
	 public BankAccount createBankAccount(@RequestBody BankAccount bankAccount) {
		 return bankAccountRepository.save(bankAccount);
	 }
	 
	 
	//delete rest api
	 @DeleteMapping("/bank-accounts/{id}")
	 public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Integer id){
		 BankAccount bankAccount = bankAccountRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not"
		 		+ "exits with id:"+id ));
		 
		 bankAccountRepository.delete(bankAccount);
		 Map<String	, Boolean> response = new HashMap<String, Boolean>();
		 response.put("deleted",Boolean.TRUE);
		 return ResponseEntity.ok(response);
	 }
}
