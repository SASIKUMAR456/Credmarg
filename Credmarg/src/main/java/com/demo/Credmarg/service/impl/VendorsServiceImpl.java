package com.demo.Credmarg.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Credmarg.dto.VendorsDto;
import com.demo.Credmarg.model.Vendors;
import com.demo.Credmarg.repository.VendorRepository;
import com.demo.Credmarg.service.Vendorservice;

@Service
public class VendorsServiceImpl implements Vendorservice{
	
	@Autowired VendorRepository repository;
	@Autowired ModelMapper mapper;

	@Override
	public String saveVendors(VendorsDto request) {
		
		Vendors requestObject = new Vendors();
		requestObject.setEmail(request.getEmail());
		requestObject.setName(request.getName());
		requestObject.setUpi(request.getUpi());
		requestObject.setStatus(11);
		this.repository.save(requestObject);
		return "Sucessfully loaded the data";
	}

	@Override
	public List<VendorsDto> listOfVendorsEmails() {

		List<Vendors> listOfEmailsResponse = this.repository.findByStatus(12);
		List<VendorsDto> dto = new ArrayList<VendorsDto>();
		VendorsDto vendorsDto = new VendorsDto();
		if (!listOfEmailsResponse.isEmpty()) {
			for (Vendors vendors : listOfEmailsResponse) {
				vendorsDto.setEmail(vendors.getEmail());
				vendorsDto.setName(vendors.getName());
				vendorsDto.setUpi(vendors.getUpi());

				dto.add(vendorsDto);
			}
		}
		return dto;
	}

	@Override
	public List<VendorsDto> findAllVendors() {
		List<Vendors> vendors =  this.repository.findAll();
		VendorsDto dto = new VendorsDto();
		List<VendorsDto> list = new ArrayList<VendorsDto>();
		for (Vendors vendorsDto : vendors) {
			dto.setEmail(vendorsDto.getEmail());
			dto.setName(vendorsDto.getName());
			dto.setUpi(vendorsDto.getUpi());
			
			list.add(dto);
		}
		return list;
	}
}
