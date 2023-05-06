package com.example.springdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springdemo.model.person;


@Repository
public interface PersonRepository extends JpaRepository<person, Long>{

}