package com.example.ServiceB;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {
	
	@GetMapping("/serviceB")
	public String getServiceBInfo() {
		
		return "Hitting Service B Successfully...";
	}
}
