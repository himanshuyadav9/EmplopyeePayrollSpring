package com.bridgelabz.employeepayrollapp.Model;




import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;

import lombok.Data;

//@Entity
public @Data class EmployeePayrollData {
    //repository model that we are going to save in database
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId;
	private String name;
	private long salary;
	private String gender;
	private LocalDate startDate;
	private String note;
	private String profilePic;
	private List<String> departments;

	public EmployeePayrollData(int empId, EmployeePayrollDTO employeepayrolldto) {
		this.employeeId = empId;
		this.name = employeepayrolldto.name;
		this.salary = employeepayrolldto.salary;
		this.gender = employeepayrolldto.gender;
		this.startDate = employeepayrolldto.startDate;
		this.note = employeepayrolldto.note;
		this.profilePic = employeepayrolldto.profilePic;
		this.departments = employeepayrolldto.departments;
	}


}
