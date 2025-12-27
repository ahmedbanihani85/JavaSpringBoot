package com.example.ServiceA;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceAController {
	
	@GetMapping("/getFromServiceB")
	public String GetInfo() {
		
		RestTemplate rest = new RestTemplate();
		
		String url = "http://localhost:8092/serviceB";
		return rest.getForObject(url, String.class);
	}

}
