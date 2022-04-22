package com.monocept.model;

public class OilChangeDecorator extends Decorator implements CarService {

	public OilChangeDecorator(CarService service) {
		super(service);
	}

	@Override
	public double getCost() {
		return 1200 + service.getCost();
	}

	@Override
	public String getDetails() {
		return getClass().getSimpleName() + " Cost: 1200" + "\n" + service.getDetails();
	}

}
