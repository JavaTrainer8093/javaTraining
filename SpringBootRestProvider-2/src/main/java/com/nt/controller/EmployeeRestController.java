package com.nt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Employee;

@RestController
@RequestMapping("/Employee")
public class EmployeeRestController {

	@GetMapping("/one")
	public ResponseEntity<Employee> getOneEmp()
	{
		return ResponseEntity.ok(new Employee(1,"sham",3.3));
	}
	
}
