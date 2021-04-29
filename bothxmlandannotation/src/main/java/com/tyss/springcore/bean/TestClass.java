package com.tyss.springcore.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
ApplicationContext context= new ClassPathXmlApplicationContext("Car.xml");
Car car =context.getBean("car",Car.class);
System.out.println(car.getCompany());
System.out.println(car.getEngine().getCc());
System.out.println(car.getEngine().getType());
	}

}
