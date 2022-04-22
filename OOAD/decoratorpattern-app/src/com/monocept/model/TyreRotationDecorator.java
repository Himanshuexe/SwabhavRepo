package com.monocept.model;

public class TyreRotationDecorator extends Decorator implements CarService {

	public TyreRotationDecorator(CarService service) {
		super(service);
	}

	@Override
	public double getCost() {
		return 350 + service.getCost();
	}

	@Override
	public String getDetails() {
		return getClass().getSimpleName() + " Cost: 350" + "\n" + service.getDetails();
	}

}
