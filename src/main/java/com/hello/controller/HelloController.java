package com.hello.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/demo")
	public String getMessage() {
		return "This is my first project to deploy azure";
	}
	
	@GetMapping("/msg")
	public String getTextMsg() {
		return "Microsoft Azure is a cloud computing platform and service that offers a "
				+ "wide array of services including computing, storage, networking, analytics,"
				+ " and artificial intelligence. It allows users to build, deploy, and manage"
				+ " applications and services across a global network of Microsoft-managed data centers."
				+ " Essentially, Azure provides the infrastructure, platform, and software needed to "
				+ "run applications and services in the cloud, eliminating the need for on-premises hardware. ";
	}

}
