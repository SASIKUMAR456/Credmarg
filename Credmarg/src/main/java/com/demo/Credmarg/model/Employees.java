package com.demo.Credmarg.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee")
public class Employees {
	
	@Id
	private String name;
	private String designation;
	private double ctc;
	private String email;

}
