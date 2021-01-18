package com.bridgelabz.employeepayrollapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.employeepayrollapp.Model.EmployeePayrollData;
import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.dto.ResponseDTO;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {
	
	@RequestMapping(value = {"", "/", "/get"})
	public ResponseEntity<ResponseDTO> getEmployeePayrollData() {
		EmployeePayrollData empdata = null;
		empdata = new EmployeePayrollData(1, new EmployeePayrollDTO("Himanshu", 3000));
		ResponseDTO respDTO = new ResponseDTO("Get Call Successful", empdata);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@GetMapping("/get/{empId}")
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId")int empId) {
		EmployeePayrollData empdata = null;
		empdata = new EmployeePayrollData(1, new EmployeePayrollDTO("Himanshu", 3000));
		ResponseDTO respDTO = new ResponseDTO("Get Call for ID Successful", empdata);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addEmployeePayrollData(
								  @RequestBody EmployeePayrollDTO empPayrollDTO) {
		EmployeePayrollData empdata = null;
		empdata = new EmployeePayrollData(1, new EmployeePayrollDTO("Himanshu", 3000));
		ResponseDTO respDTO = new ResponseDTO("Created Employee Payroll Data Sucessfully", empdata);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData(
								  @RequestBody EmployeePayrollDTO empPayrollDTO) {
		EmployeePayrollData empdata = null;
		empdata = new EmployeePayrollData(1, new EmployeePayrollDTO("Himanshu", 3000));
		ResponseDTO respDTO = new ResponseDTO("Updated Employee Payroll Data Successfully", empdata);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId")int empId) {
		EmployeePayrollData empdata = null;
		empdata = new EmployeePayrollData(1, new EmployeePayrollDTO("Himanshu", 3000));
		ResponseDTO respDTO = new ResponseDTO("Deleted Employee Payroll Data Successfully", empdata);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
}
