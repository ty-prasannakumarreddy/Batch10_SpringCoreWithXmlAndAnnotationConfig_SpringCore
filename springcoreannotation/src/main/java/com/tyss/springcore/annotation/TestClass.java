package com.tyss.springcore.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.springcore.configpackage.AllConfingFile;

public class TestClass {
	public static void main(String[] args) {


		ApplicationContext context = new AnnotationConfigApplicationContext(AllConfingFile.class);
		EmployeeTwo emp=  context.getBean(EmployeeTwo.class);
		System.out.println(emp.getId());
		System.out.println(emp.getEname());
		System.out.println(emp.getDeportment().getDname());
		System.out.println(emp.getDeportment().getDno());
	}

}
