package com.demo.Credmarg.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
public class VendorsDto {
	private String name;
	private String email;
	private String upi;

}
