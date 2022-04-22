package com.monocept.model;

public class Man implements IMannerable {

	@Override
	public void wish() {
		System.out.println("Man wished Hello");
	}

	@Override
	public void depart() {
		System.out.println("Man departed Goodbye");
	}

}
