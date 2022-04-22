package com.monocept.product.factory;

public class Bmw implements IAuto {

	@Override
	public void start() {
		System.out.println("Bmw Started");
	}

	@Override
	public void stop() {
		System.out.println("Bmw Stopped");
	}

}
