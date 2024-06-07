package com.demo.Credmarg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Credmarg.service.EmailService;

@RestController
@RequestMapping("/emailSend")
@CrossOrigin("*")
public class EmailController {
	
	@Autowired EmailService emailService;

	@GetMapping("/sendEmails")
	public ResponseEntity<?> sendEmail(){
		return new ResponseEntity<>(this.emailService.sendEmail(),HttpStatus.OK);
	}
}
