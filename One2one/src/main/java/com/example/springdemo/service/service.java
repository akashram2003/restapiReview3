package com.example.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemo.model.person;
import com.example.springdemo.repository.PersonRepository;


@Service
public class service {
	@Autowired
	PersonRepository personRepo;
	
	public List<person> fetchAllPersons(){
		return personRepo.findAll();
	}
	
	public person savePersons(person p) {
		return personRepo.save(p);
	}
	
}