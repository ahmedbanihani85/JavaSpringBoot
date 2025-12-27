package com.example.EurekaClient_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")
public class Clientcontroller {
	@GetMapping("/paynow/{price}")
	public String payNoe(@PathVariable int price) {
		return "Payment with price "+price+" is successfully done.";
	}
}
