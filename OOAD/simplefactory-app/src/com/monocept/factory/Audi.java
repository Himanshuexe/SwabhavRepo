package com.monocept.factory;

class Audi implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("Audi Car Started.");
	}

	@Override
	public void stop() {
		System.out.println("Audi Car Stopped.");
	}
}
