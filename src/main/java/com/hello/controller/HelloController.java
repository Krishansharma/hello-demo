package com.hello.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/demo")
	public String getMessage() {
		return "This is my first project to deploy azure";
	}

}
