package com.cox.bmw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan
@PropertySource({"classpath:application.properties"})
//@RequestMapping("/rest")
public class DemoApplication {
	
	/*@Autowired
	private EmployeeService employeeService;*/

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	/*@GetMapping("/hello")
	public String sayHello()
	{
		
		return "Hello User!! ";
	}*/
}