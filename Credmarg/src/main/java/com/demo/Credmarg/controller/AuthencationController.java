package com.demo.Credmarg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Credmarg.service.AuthenticationService;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthencationController {

	@Autowired AuthenticationService service;
	
	@GetMapping("/roles")
	public ResponseEntity<?> authentication(@RequestParam("user") String user,@RequestParam("password") String password){
		return new ResponseEntity<>(this.service.getRole(user,password),HttpStatus.OK);
	}
}
