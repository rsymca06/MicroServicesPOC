package com.microservices.poc.finance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.microservices.poc.finance.model.IncomeAndTax;
import com.microservices.poc.finance.service.FinanceService;

@RestController
@RequestMapping(value="/finance")
public class FinanceController {
	@Autowired
	FinanceService financeService;
	
	@RequestMapping(method=RequestMethod.POST)
	public void addIncomeAndTax(@RequestBody IncomeAndTax tax){
	 financeService.addIncomeAndTax(tax);	
	}
	
	@RequestMapping(value="/allEmployeesIncomeAndTax",method=RequestMethod.GET)
	public List<IncomeAndTax> getAllEmployeesIncomeAndTax(){
		return financeService.getAllEmployeesIncomeAndTax();
	}
	@RequestMapping(value="/employeeIncomeAndTax/{id}",method=RequestMethod.GET)
	public IncomeAndTax getEmployeeIncomeAndTax(@PathVariable("id") long id){
		return financeService.getEmployeeIncomeAndTax(id);
	}
	
}
