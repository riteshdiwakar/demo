package com.cox.bmw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cox.bmw.service.EmployeeService;

@RestController
public class EmployeeController {
	
	private EmployeeService employeeService;
	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	@GetMapping("/hello")
	public String sayHello()
	{
		
		return "Hello User!! "+employeeService.listAllEmployee().toString();
	}
	
}
