package com.demo.Credmarg.controller;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Credmarg.dto.EmployeesDto;
import com.demo.Credmarg.service.Employeeserive;

@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeController {

	@Autowired Employeeserive service;
	
	@PostMapping("/saveEmployee")
	public ResponseEntity<?> saveEmployee(@RequestBody EmployeesDto request){
		String message= this.service.saveEmployee(request);
		return ResponseEntity.ok(Collections.singletonMap("message", message));
	}
	
	@GetMapping("/viewEmployees")
	public ResponseEntity<?> findAllEmployees(){
		return new ResponseEntity<>(this.service.findAll(),HttpStatus.OK);
	}
}
