package com.monocept.model;

public class Infant extends Man {

	static {
		System.out.println("Inside Infant's static block.");
	}

	public Infant() {
	}

	@Override
	public void play() {
		System.out.println("Infant played ");
	}
}
