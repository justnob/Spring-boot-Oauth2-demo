package com.amarnath.learnoath.welcomecontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/")
	private String getWelcomeMessage() {
		
		return "Welcome the the google oauth2 demo";
		
	}

}
