package com.tyss.springcore.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.springcore.annotationconfig.EmployeeConfig;

public class EmployeeTestClass {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee emp=  context.getBean("empTwo",Employee.class);
		System.out.println(emp.getEid());
		System.out.println(emp.getEname());
		
		 
	}

}
