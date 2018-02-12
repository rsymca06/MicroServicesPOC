package com.microservices.poc.finance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservices.poc.finance.model.IncomeAndTax;
import com.microservices.poc.finance.repository.FinanceRepository;

public class FinanceServiceImpl implements FinanceService{
	@Autowired
	FinanceRepository financeRepository;
	@Override
	public void addIncomeAndTax(IncomeAndTax incomeAndTax){
		financeRepository.save(incomeAndTax);
	}
	@Override
	public List<IncomeAndTax> getAllEmployeesIncomeAndTax(){
		return financeRepository.findAll();
	}
	@Override
	public IncomeAndTax getEmployeeIncomeAndTax(long id){
		return financeRepository.findOne(id);
	}
}
