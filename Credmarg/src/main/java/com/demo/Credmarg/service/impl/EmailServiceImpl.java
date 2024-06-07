package com.demo.Credmarg.service.impl;

import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.demo.Credmarg.model.Vendors;
import com.demo.Credmarg.repository.VendorRepository;
import com.demo.Credmarg.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService{

	private static final String message = "Sending payments to vendor %s at upi %s";
	
	@Autowired VendorRepository repository;
	@Autowired JavaMailSender emailSender;
	
	@Value("${spring.mail.username")
	private String sender;
	
	@Override
	public String sendEmail() {

		List<Vendors> listOfVendors = this.repository.findAll();
		Vendors vendors = new Vendors();
		if (!listOfVendors.isEmpty()) {
			for (Vendors vendors2 : listOfVendors) {
				MimeMessage message = this.emailSender.createMimeMessage();
				String body = String.format(EmailServiceImpl.message, vendors2.getName(),vendors2.getUpi());
				StringBuffer subject = new StringBuffer("Payments-");
				subject.append(vendors2.getName());
				try {
					MimeMessageHelper messageHelper = new MimeMessageHelper(message, true);
					messageHelper.setTo(vendors2.getEmail());
					messageHelper.setFrom(sender);
					messageHelper.setText(body);
					messageHelper.setSubject(subject.toString());
//					message.setContent(messageHelper.toString(),"text/html");
				this.emailSender.send(message);
				
				vendors.setEmail(vendors2.getEmail());
				vendors.setName(vendors2.getName());
				vendors.setStatus(12);
				vendors.setUpi(vendors2.getUpi());
				
				this.repository.save(vendors);
				} catch (MessagingException e) {
					e.printStackTrace();
				}
			}
		}
		return "Mail Sent Successfully...";
	}

}
