package com.cox.bmw.service;

import com.cox.bmw.domain.Employee;

public interface EmployeeService {
	
	Iterable<Employee> listAllEmployee();

	Employee getEmployeeById(Integer id);

	Employee saveEmployee(Employee employee);
}
