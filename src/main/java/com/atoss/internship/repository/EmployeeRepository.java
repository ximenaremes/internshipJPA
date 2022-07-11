package com.atoss.internship.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.atoss.internship.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository <Employee, Long> {
	
	ArrayList <Employee> findAll();
	
	
	
	

}
