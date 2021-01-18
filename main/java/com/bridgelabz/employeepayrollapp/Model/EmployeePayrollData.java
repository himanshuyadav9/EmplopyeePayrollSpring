package com.bridgelabz.employeepayrollapp.Model;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;

public class EmployeePayrollData {
    //repository model that we are going to save in database
	
	private int employeeId;
	private String name;
	private long salary;

	public EmployeePayrollData(int empId, EmployeePayrollDTO employeepayrolldto) {
		this.employeeId = empId;
		this.name = employeepayrolldto.name;
		this.salary = employeepayrolldto.salary;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
}
