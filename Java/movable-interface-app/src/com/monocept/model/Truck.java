package com.monocept.model;

public class Truck extends Vehicle {

	public Truck(String description) {
		super(description);
	}

	public void move() {
		System.out.println(description + " Truck moving.");
	}
}
