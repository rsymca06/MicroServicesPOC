package com.microservices.poc.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservices.poc.employee.dao.EmployeeDao;
import com.microservices.poc.employee.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeDao employeeDao;
	@Override
	public List<Employee> getAllEmployees(){
		return employeeDao.findAll();
	}
	@Override
	public Employee getEmployee(long id){
		return employeeDao.findOne(id);
	}
	@Override
	public void addEmployee(Employee employee){
		employeeDao.save(employee);
	}
}
