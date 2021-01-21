
package com.bridgelabz.employeepayrollapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.employeepayrollapp.Model.EmployeePayrollData;

@Repository
public interface IEmployeePayrollRepo extends JpaRepository<EmployeePayrollData, Integer> {
	
}
