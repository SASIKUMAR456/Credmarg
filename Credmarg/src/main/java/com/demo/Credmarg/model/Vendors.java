package com.demo.Credmarg.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "vendors")
public class Vendors {
	@Id
	private String name;
	private String email;
	private String upi;
	private int status;

}
