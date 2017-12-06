package com.cox.bmw.repositories;

import org.springframework.context.annotation.Primary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cox.bmw.domain.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	
}
