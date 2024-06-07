package com.demo.Credmarg.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.demo.Credmarg.model.JwtResponse;
import com.demo.Credmarg.service.AuthenticationService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

	@Override
	public JwtResponse getRole(String user, String password) {

		Map<String, String> jwtResponse = new HashMap<String, String>();

		jwtResponse.put("Token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ986gjsdfmsfsjhkjhksfsdf47d");
		jwtResponse.put("Role", "ADMIN");

		if (user.equalsIgnoreCase("ADMIN")) {
			JwtResponse response = new JwtResponse();
			response.setToken(jwtResponse.get("Token").toString());
			response.setRole(jwtResponse.get("Role").toString());
			return response;
		}
		return null;
	}

}
