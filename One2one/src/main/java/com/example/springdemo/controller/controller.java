package com.example.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.model.person;
import com.example.springdemo.service.service;

@RestController
public class controller {

		@Autowired
		service pService;
		
		@GetMapping("/getAllPersons")
		public List<person> fetchAllPersons() {
			List<person> pList=pService.fetchAllPersons();
			return pList;
		}
		
		@PostMapping("/savePersons") 
		public person savePersons(@RequestBody person p) {
			return pService.savePersons(p);
		}
	}