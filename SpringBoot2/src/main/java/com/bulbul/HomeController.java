package com.bulbul;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
//	@RequestMapping("/")
	@GetMapping("/")
	public String home() {
//		return "My first Spring Boot rest response";
		return "index";
	}
	
	@GetMapping("/about")
	public String about() {
//		return "Contact: 9876543210";
		return "about";
	}
}
