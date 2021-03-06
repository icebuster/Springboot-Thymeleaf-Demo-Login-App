package com.tm.aafhello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Adding a comment to test
@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		
		return "/home";
	}
	
	@GetMapping("/login")
    public String login() {
        return "/login";
    }
	
	@GetMapping("/403")
    public String error403() {
        return "/error/403";
    }
}
