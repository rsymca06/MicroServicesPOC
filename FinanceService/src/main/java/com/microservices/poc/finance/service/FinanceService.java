package com.microservices.poc.finance.service;

import java.util.List;

import com.microservices.poc.finance.model.IncomeAndTax;

public interface FinanceService {
	public void addIncomeAndTax(IncomeAndTax tax);
	public List<IncomeAndTax> getAllEmployeesIncomeAndTax();
	public IncomeAndTax getEmployeeIncomeAndTax(long id);
}
