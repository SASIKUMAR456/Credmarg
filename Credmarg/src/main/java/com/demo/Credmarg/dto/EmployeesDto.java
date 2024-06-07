package com.demo.Credmarg.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
public class EmployeesDto {
	
	private String name;
	private String designation;
	private double ctc;
	private String email;

}
