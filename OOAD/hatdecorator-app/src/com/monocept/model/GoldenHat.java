package com.monocept.model;

public class GoldenHat extends HatDecorator implements Hat {

	public GoldenHat(Hat hat) {
		super(hat);
	}

	@Override
	public double getPrice() {
		return 250 + hat.getPrice();
	}

	@Override
	public String getDescription() {
		return "Golden coloured " + hat.getDescription();
	}

}
