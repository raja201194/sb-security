package com.sb.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String everyone() {
		return "Accessible to everyone";
	}
	
	@GetMapping("/user")
	public String user() {
		return "Accessible to only user roles";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "Accessible to only admins";
	}
}
