package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.open.Greet;
import com.netflix.discovery.converters.Auto;

@RestController
public class WelcomController {

	@Autowired
	private Greet feignGreet;
	
	@GetMapping("/welcome")
	public String getWelcome() {
		
		String str=feignGreet.invokeGreet();
		
		return str+", Hlo welcome to the Learning...";
	}
}
