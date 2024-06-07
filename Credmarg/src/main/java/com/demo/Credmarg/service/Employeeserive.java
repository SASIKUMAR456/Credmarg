package com.demo.Credmarg.service;

import java.util.List;

import com.demo.Credmarg.dto.EmployeesDto;

public interface Employeeserive {

	String saveEmployee(EmployeesDto request);
	List<EmployeesDto> findAll();
	
	
}
