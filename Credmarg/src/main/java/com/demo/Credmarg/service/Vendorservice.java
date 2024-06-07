package com.demo.Credmarg.service;

import java.util.List;

import com.demo.Credmarg.dto.VendorsDto;
import com.demo.Credmarg.model.Vendors;

public interface Vendorservice {
	
	String saveVendors(VendorsDto request);
	List<VendorsDto> findAllVendors();
	List<VendorsDto> listOfVendorsEmails(); 

}
