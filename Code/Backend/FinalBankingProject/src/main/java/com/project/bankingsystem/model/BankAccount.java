package com.project.bankingsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bank_accounts")
public class BankAccount {
	
	@Id
	Integer accNo;
	Integer customerId;
	Boolean isSavingAccount;
	String branchCityName;
	Double balance;
	
	public BankAccount() {
		
	}

	public BankAccount(Integer accNo, Integer customerId, Boolean isSavingAccount, String branchCityName,
			Double balance) {
		super();
		this.accNo = accNo;
		this.customerId = customerId;
		this.isSavingAccount = isSavingAccount;
		this.branchCityName = branchCityName;
		this.balance = balance;
	}

	public Integer getAccNo() {
		return accNo;
	}

	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Boolean getIsSavingAccount() {
		return isSavingAccount;
	}

	public void setIsSavingAccount(Boolean isSavingAccount) {
		this.isSavingAccount = isSavingAccount;
	}

	public String getBranchCityName() {
		return branchCityName;
	}

	public void setBranchCityName(String branchCityName) {
		this.branchCityName = branchCityName;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", customerId=" + customerId + ", isSavingAccount=" + isSavingAccount
				+ ", branchCityName=" + branchCityName + ", balance=" + balance + "]";
	}

	

	
	
}
