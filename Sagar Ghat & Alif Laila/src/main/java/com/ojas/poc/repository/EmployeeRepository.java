package com.ojas.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.poc.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
}
