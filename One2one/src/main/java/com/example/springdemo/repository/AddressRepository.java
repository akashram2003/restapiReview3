package com.example.springdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springdemo.model.address;


@Repository
public interface AddressRepository extends JpaRepository<address, Long>{
	
}