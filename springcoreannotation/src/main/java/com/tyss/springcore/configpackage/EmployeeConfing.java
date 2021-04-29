package com.tyss.springcore.configpackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tyss.springcore.annotation.EmployeeTwo;

@Configuration
public class EmployeeConfing {
	@Bean
	public EmployeeTwo getEmp() {
		EmployeeTwo emp = new  EmployeeTwo();
		emp.setId(101);
		emp.setEname("boreddyprasannakumarreddy");
		return emp;
		
		
	}
	

}
