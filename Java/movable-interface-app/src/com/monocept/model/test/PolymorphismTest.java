package com.monocept.model.test;

import com.monocept.model.*;

public class PolymorphismTest {
	public static void main(String[] args) {
		Vehicle[] vehicles = { new Car("Ferrari"), new Bike("BMW"), new Truck("Ford"), new Car("Lambhorghini") };
		startRace(vehicles);
	}

	public static void startRace(IMovable[] movables) {
		System.out.println("Race Started");
		for (IMovable i : movables) {
			i.move();
		}
		System.out.println("Race Ended");
	}
}
