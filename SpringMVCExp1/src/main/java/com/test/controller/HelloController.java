package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //returns model and control view(jsp files) object
public class HelloController {
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String homePage() {
		return "home";
	}
	@GetMapping("/greet")
	public String greetAgain() {
		return "greetpage";
	}
}
