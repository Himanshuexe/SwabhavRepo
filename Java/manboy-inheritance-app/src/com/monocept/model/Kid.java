package com.monocept.model;

public class Kid extends Man {

	static {
		System.out.println("Inside Kid's static block.");
	}

	public Kid() {
	}

	@Override
	public void play() {
		System.out.println("Kid played ");
	}
}
