package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
@Controller
public class HelloController {
	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("msg","simple thymeleaf example response");
		return "home";
	}
	
}
