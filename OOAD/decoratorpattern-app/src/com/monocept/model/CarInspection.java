package com.monocept.model;

public class CarInspection implements CarService {

	@Override
	public double getCost() {
		return 250;
	}

	@Override
	public String getDetails() {
		return getClass().getSimpleName() + " Cost: 250";
	}

}
