package com.demo.Credmarg.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Credmarg.dto.EmployeesDto;
import com.demo.Credmarg.model.Employees;
import com.demo.Credmarg.repository.EmployeeRepository;
import com.demo.Credmarg.service.Employeeserive;

@Service
public class EmployeeServiceImpl implements Employeeserive{
	
	@Autowired  EmployeeRepository repository;
	@Autowired ModelMapper mapper;

	@Override
	public String saveEmployee(EmployeesDto request) {
		
		if(!request.getEmail().isEmpty() && !request.getName().isEmpty()) {
			Employees finalRequstObject = this.mapper.map(request, Employees.class);
			this.repository.save(finalRequstObject);
			return "Sucessfully loaded the data";
		}
		return "Validation is failed";
	}

	@Override
	public List<EmployeesDto> findAll() {
		List<Employees> list = this.repository.findAll();
		if(!list.isEmpty()) {
			List<EmployeesDto> dtos = list.stream()
					.map(r->this.mapper.map(r, EmployeesDto.class))
					.collect(Collectors.toList());
			
			return dtos;
		}
		return null;
	}

}
