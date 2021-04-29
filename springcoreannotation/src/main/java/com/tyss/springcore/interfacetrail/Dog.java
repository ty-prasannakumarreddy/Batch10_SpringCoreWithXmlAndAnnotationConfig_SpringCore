package com.tyss.springcore.interfacetrail;

public class Dog implements Animal {

	@Override
	public void eat() {

		System.out.println("Dog is eating padigree");
	}

	@Override
	public void speak() {
		System.out.println("Bow Bow.......");
	}

}
