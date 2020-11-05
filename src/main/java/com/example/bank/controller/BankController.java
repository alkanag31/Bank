package com.example.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankController {
			
		
		@GetMapping("/name")
		public String getBankName(){
			return "State Bank Of India";
		}
		
		@GetMapping("/address")
		public String getBankAddress(){
			return "Electronic City, Bangalore, Karnataka";
		}
		
		
	}

