package com.monocept.factory;

class Bmw implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("Bmw Car started.");
	}

	@Override
	public void stop() {
		System.out.println("Bmw Car stopped.");
	}
}
