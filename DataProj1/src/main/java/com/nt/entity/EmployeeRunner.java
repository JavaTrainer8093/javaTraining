package com.nt.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repo.EmployeeRepository;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		repo.save(new Employeeo(101,"Ram1",500.0));
		
		
	}
	
	
}
