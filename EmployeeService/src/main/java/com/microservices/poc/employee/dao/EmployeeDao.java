package com.microservices.poc.employee.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.poc.employee.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long> {
	

}
