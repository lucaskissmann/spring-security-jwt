package com.lucas.kissmann.spring_security_jwt.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.kissmann.spring_security_jwt.services.AuthenticationService;

@RestController
public class AuthenticationController {
	
	private final AuthenticationService service;

	public AuthenticationController(AuthenticationService service) {
		this.service = service;
	}

	@PostMapping("authenticate")
	public String authenticate(Authentication authentication) {
		return service.authenticate(authentication);
	}
}
