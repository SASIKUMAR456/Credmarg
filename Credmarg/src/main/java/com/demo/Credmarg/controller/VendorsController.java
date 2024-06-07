package com.demo.Credmarg.controller;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Credmarg.dto.VendorsDto;
import com.demo.Credmarg.service.Vendorservice;

@RestController
@RequestMapping("/vendors")
@CrossOrigin("*")
public class VendorsController {

	
	@Autowired Vendorservice service;
	
	@RequestMapping(value = "/saveVendor",method = RequestMethod.POST)
	public ResponseEntity<?> saveVendor(@RequestBody VendorsDto request){
		String msg = this.service.saveVendors(request);
		return ResponseEntity.ok(Collections.singletonMap("message", msg));
	}
	
	@GetMapping("/viewVendors")
	public ResponseEntity<?> findAll(){
		return new ResponseEntity<>(this.service.findAllVendors(),HttpStatus.OK);
	}
	
	@GetMapping("/sentemailVendorsList")
	public ResponseEntity<?> listOfVendorssentEmails(){
		return new ResponseEntity<>(this.service.listOfVendorsEmails(),HttpStatus.OK);
	}
}
