package com.cox.bmw.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cox.bmw.domain.Employee;
import com.cox.bmw.repositories.EmployeeRepository;
import com.cox.bmw.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	/*public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}*/

	@Override
	public Iterable<Employee> listAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> empList	=	new ArrayList<Employee>();
		Employee employee	=	new Employee();
		employee.setDesignation("SSE");
		employee.setId(2);
		employee.setName("Sudhakar Sharma");
		empList.add(employee);
		employee = new Employee();
		employee.setDesignation("SE");
		employee.setId(1);
		employee.setName("Ritesh");
		empList.add(employee);
		return empList;
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return employeeRepository.findOne(id);
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
