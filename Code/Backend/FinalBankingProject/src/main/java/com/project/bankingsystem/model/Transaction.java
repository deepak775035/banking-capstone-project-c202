package com.project.bankingsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "transactions")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer trasactionId;
	Integer fromAccNo;
	Integer toAccNo;
	Double amount;
	Boolean isDebit;
	
	public Transaction() {
		
	}

	public Transaction(Integer fromAccNo, Integer toAccNo, Double amount, Boolean isDebit) {
		super();
		this.fromAccNo = fromAccNo;
		this.toAccNo = toAccNo;
		this.amount = amount;
		this.isDebit = isDebit;
	}

	public Integer getTrasactionId() {
		return trasactionId;
	}

	public void setTrasactionId(Integer trasactionId) {
		this.trasactionId = trasactionId;
	}

	public Integer getFromAccNo() {
		return fromAccNo;
	}

	public void setFromAccNo(Integer fromAccNo) {
		this.fromAccNo = fromAccNo;
	}

	public Integer getToAccNo() {
		return toAccNo;
	}

	public void setToAccNo(Integer toAccNo) {
		this.toAccNo = toAccNo;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Boolean getIsDebit() {
		return isDebit;
	}

	public void setIsDebit(Boolean isDebit) {
		this.isDebit = isDebit;
	}


	@Override
	public String toString() {
		return "Transaction [trasactionId=" + trasactionId + ", fromAccNo=" + fromAccNo + ", toAccNo=" + toAccNo
				+ ", amount=" + amount + ", isDebit=" + isDebit + "]";
	}

	
	
	
}
