package com.tyss.springcore.annotationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tyss.springcore.bean.Employee;

@Configuration
public class EmployeeConfig {
	 @Bean(name="empOne")
	public Employee getEmployee() {
		
		return new Employee();
	}
	 @Bean(name="empTwo")
	 public Employee getEmployeeTwo(){
		 return new Employee(101, "prasannakumar");
		 
		 
	 }
	

}
