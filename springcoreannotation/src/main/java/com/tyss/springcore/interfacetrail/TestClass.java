package com.tyss.springcore.interfacetrail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClass {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(PatConfig.class);
		Pat pat = context.getBean(Pat.class);
		System.out.println(pat.getName());
		pat.getAnimal().eat();
		pat.getAnimal().speak();

	}

}
