package com.monocept.model;

public class StandardHat implements Hat {

	@Override
	public String getName() {
		return "Standard Hat";
	}

	@Override
	public double getPrice() {
		return 500;
	}

	@Override
	public String getDescription() {
		return "standard hat.";
	}

}
