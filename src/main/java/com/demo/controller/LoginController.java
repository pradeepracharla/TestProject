package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@GetMapping("/loginPage")
	public String login() {
		
		System.out.println("from login controllers");
		
		return "login";
		
	}
	
	@RequestMapping(value = "/SignUp",method =RequestMethod.GET)
	public String registeration() {
		
		System.out.println("from login controller");
		
		return "register";
		
	}
	
	@PostMapping("/dashboard")
	public String submit() {		
		
		System.out.println("from dashboard");
		
		return "dashboard";
		
	}
}
