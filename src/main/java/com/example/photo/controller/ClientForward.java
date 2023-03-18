package com.example.photo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientForward {
	@GetMapping(value="/**/{path:[^\\.]*}")
	public String Forward() {
		return "forward:/";	
	}
} 
