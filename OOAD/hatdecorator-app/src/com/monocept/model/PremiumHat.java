package com.monocept.model;

public class PremiumHat implements Hat {

	@Override
	public String getName() {
		return "Premium Hat";
	}

	@Override
	public double getPrice() {
		return 1000;
	}

	@Override
	public String getDescription() {
		return "premium hat.";
	}

}
