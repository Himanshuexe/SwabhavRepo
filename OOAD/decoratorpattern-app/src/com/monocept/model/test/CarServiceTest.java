package com.monocept.model.test;

import com.monocept.model.CarInspection;
import com.monocept.model.CarService;
import com.monocept.model.OilChangeDecorator;
import com.monocept.model.TyreRotationDecorator;

public class CarServiceTest {
	public static void main(String[] args) {
		CarService service;
		service = new OilChangeDecorator(new TyreRotationDecorator(new CarInspection()));
		System.out.println(service.getDetails());
		System.out.println("Service Cost:" + service.getCost());
	}

}
