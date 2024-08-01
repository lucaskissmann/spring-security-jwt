package com.lucas.kissmann.spring_security_jwt.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(value = "private")
public class PrivateController {
	
	@GetMapping()
	public String getMessage() {
		return "Hello from private API controller";
	}
	
}
