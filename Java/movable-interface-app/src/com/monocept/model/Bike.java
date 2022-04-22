package com.monocept.model;

public class Bike extends Vehicle {

	public Bike(String description) {
		super(description);
	}

	public void move() {
		System.out.println(description + " Bike moving.");
	}
}
