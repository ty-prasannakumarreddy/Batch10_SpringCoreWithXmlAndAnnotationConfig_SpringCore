package com.tyss.springcore.interfacetrail;

public class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("cat is eating curdrice");
	}

	@Override
	public void speak() {
		System.out.println("miyav miyav.........");
	}

}
