package com.microservices.poc.employee.model;

public class IncomeAndTax {
	private long empId;
	private long totalIncome;
	private long taxableIncome;
	private long totalTax;
	private long taxDeductedTillDate;
	private long taxRemaining;
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public long getTotalIncome() {
		return totalIncome;
	}
	public void setTotalIncome(long totalIncome) {
		this.totalIncome = totalIncome;
	}
	public long getTaxableIncome() {
		return taxableIncome;
	}
	public void setTaxableIncome(long taxableIncome) {
		this.taxableIncome = taxableIncome;
	}
	public long getTotalTax() {
		return totalTax;
	}
	public void setTotalTax(long totalTax) {
		this.totalTax = totalTax;
	}
	public long getTaxDeductedTillDate() {
		return taxDeductedTillDate;
	}
	public void setTaxDeductedTillDate(long taxDeductedTillDate) {
		this.taxDeductedTillDate = taxDeductedTillDate;
	}
	public long getTaxRemaining() {
		return taxRemaining;
	}
	public void setTaxRemaining(long taxRemaining) {
		this.taxRemaining = taxRemaining;
	}
	
	

}
