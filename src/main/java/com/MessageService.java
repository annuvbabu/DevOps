package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageService {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	
	@GetMapping("/helloworld")
	public String sayHelloworld() {
		return "hello world";
	}
	
	@GetMapping("/helloengineers")
	public String sayHelloengineers() {
		return "hello engineers";
	}
	
	@GetMapping("/hi")
	public String sayHi() {
		return "hi";
	}
}

