package com.monocept.model;

public class Boy extends Man {

	static {
		System.out.println("Inside Boy's static block.");
	}

	public Boy() {
		/*System.out.println("Boy created.");*/
	}

	@Override
	public void play() {
		System.out.println("Boy played");
	}

	public void eat() {
		System.out.println("Boy ate");
	}
}
