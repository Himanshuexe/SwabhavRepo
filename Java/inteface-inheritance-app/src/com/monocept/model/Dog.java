package com.monocept.model;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Dog ate.");
	}

	@Override
	public void makeSound() {
		System.out.println("Dog barked");
	}

}
