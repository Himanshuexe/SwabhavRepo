package com.monocept.model;

public class Monkey implements Animal {

	@Override
	public void eat() {
		System.out.println("Monkey ate.");
	}

	@Override
	public void makeSound() {
		System.out.println("Monkey chattered");
	}

}
