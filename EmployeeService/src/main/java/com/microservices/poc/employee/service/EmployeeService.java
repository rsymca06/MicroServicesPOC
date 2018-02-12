package com.microservices.poc.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservices.poc.employee.model.Employee;

@Service
public interface EmployeeService {
	public List<Employee> getAllEmployees();
	public Employee getEmployee(long id);
	public void addEmployee(Employee employee);
}
