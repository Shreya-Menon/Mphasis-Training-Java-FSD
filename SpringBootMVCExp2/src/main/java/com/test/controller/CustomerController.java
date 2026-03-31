package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.model.Customer;

@Controller
public class CustomerController {
	@GetMapping("/")
	public String homePage() {
		return "home";
	}
	@GetMapping("/cform")
	public String bookForm() {
		return "customerpage";
	}
	@PostMapping("/submit")
	public String submitCustomerForm(
			@RequestParam("id")int id,
			@RequestParam("name") String name,
			@RequestParam("city") String city,
			
			Model model, Customer customer) {
		customer.setId(id);

		customer.setName(name);

		customer.setCity(city);
		
		model.addAttribute("data",customer);
		if(customer.getId()>0) {

			return "success";

		}

		else {

			return "customerpage";

		}

	}




}


