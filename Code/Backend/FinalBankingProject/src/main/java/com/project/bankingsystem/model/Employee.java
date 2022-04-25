package com.project.bankingsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;
	
	@Column(name = "full_name")
	private String name;
	
	@Column(name = "branch_city_name")
	private String branchCityName;
		
	
	public Employee() {
		
	}


	public Employee(String name, String branchCityName) {
		super();
		this.name = name;
		this.branchCityName = branchCityName;
	}


	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBranchCityName() {
		return branchCityName;
	}


	public void setBranchCityName(String branchCityName) {
		this.branchCityName = branchCityName;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", branchCityName=" + branchCityName + "]";
	}
	
	
	
	
	
}
