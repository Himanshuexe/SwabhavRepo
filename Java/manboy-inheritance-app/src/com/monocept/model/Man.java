package com.monocept.model;

public class Man {

	public Man() {
		/* System.out.println("Man created."); */
	}

	static {
		System.out.println("Inside Man's static block.");
	}

	public void read() {
		System.out.println("Man read");
	}

	public void play() {
		System.out.println("Man played");
	}
}
