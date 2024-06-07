package com.demo.Credmarg.service;

import com.demo.Credmarg.model.JwtResponse;

public interface AuthenticationService {

	JwtResponse getRole(String user,String password);
}
