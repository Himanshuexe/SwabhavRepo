package com.monocept.model;

public class Decorator {
	protected CarService service;

	public Decorator(CarService service) {
		this.service = service;
	}
}
