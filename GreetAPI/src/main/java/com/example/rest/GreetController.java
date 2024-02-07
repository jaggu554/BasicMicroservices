package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
	@Autowired
	private Environment env;

	@GetMapping("/greet")
	public String welcome() {
		
		String port=env.getProperty("server.port");
		
		return "Welcome to the Greet API ("+ port +")";
	}
}
