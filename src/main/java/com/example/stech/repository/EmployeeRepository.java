package com.example.stech.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.stech.model.Employee;

public interface EmployeeRepository 
					extends CrudRepository<Employee, Long> {
}