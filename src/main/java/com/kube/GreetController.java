package com.kube;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
	@RequestMapping("/")
	public String index() {
		return "Greetings from Kubernetes";
	}

}
