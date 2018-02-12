package com.microservices.poc.employee.model;

public class EmployeeIncome {
	private long empId;
	private String name;
	private long totalIncome;
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getTotalIncome() {
		return totalIncome;
	}
	public void setTotalIncome(long totalIncome) {
		this.totalIncome = totalIncome;
	}
	
	
}
