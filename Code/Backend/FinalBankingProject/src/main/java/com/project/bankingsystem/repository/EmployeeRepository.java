package com.project.bankingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bankingsystem.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,  Integer> {

}
