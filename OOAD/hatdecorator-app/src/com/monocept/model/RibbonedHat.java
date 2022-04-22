package com.monocept.model;

public class RibbonedHat extends HatDecorator implements Hat {

	public RibbonedHat(Hat hat) {
		super(hat);
	}

	@Override
	public double getPrice() {
		return 100 + hat.getPrice();
	}

	@Override
	public String getDescription() {
		return "Ribboned " + hat.getDescription();
	}

}
