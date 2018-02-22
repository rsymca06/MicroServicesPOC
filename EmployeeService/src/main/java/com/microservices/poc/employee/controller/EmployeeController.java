package com.microservices.poc.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservices.poc.employee.model.Employee;
import com.microservices.poc.employee.model.EmployeeIncome;
import com.microservices.poc.employee.model.IncomeAndTax;
import com.microservices.poc.employee.service.EmployeeService;


@RestController
@RequestMapping(value="/employees")
public class EmployeeController {
	@Autowired
	EmployeeService service;
	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(method=RequestMethod.GET)
	public List<Employee> getAllEmployees(){
		return service.getAllEmployees();
	}
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Employee getEmployee(@PathVariable("id") long id){
		return service.getEmployee(id);
	}
	
	@RequestMapping(value="/{id}/income", method=RequestMethod.GET)
	public EmployeeIncome getEmployeeIncome(@PathVariable("id") long id){
		Employee employee = service.getEmployee(id);
		IncomeAndTax incomeAndTax = restTemplate.getForObject("http://financeService/finance/employeeIncomeAndTax/"+id,IncomeAndTax.class);
		EmployeeIncome ei = new EmployeeIncome();
		ei.setEmpId(id);
		ei.setName(employee.getName());
		ei.setTotalIncome(incomeAndTax.getTotalIncome());
		return ei;
	}
	
	@RequestMapping(method=RequestMethod.POST,consumes="application/json")
	public void addEmployee(@RequestBody Employee employee){
		service.addEmployee(employee);
	}
}
