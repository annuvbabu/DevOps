package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {
	
	@GetMapping("/add")
	public int add(int a, int b) {
		return a+b;
	}
	
	@GetMapping("/multiply")
	public int multiply(int a , int b) {
		return a*b;
	}
}

