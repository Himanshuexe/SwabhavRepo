package com.monocept.model.test;

import com.monocept.model.DogDoor;
import com.monocept.model.Remote;

public class DogDoorSimulator {

	public static void main(String[] args) {

		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);

		System.out.println("Fido barks to go outside...");
		remote.pressButton();
		System.out.println("\nFido has gone outside...");
		remote.pressButton();
		System.out.println("\nFido's all done...");
		remote.pressButton();
		System.out.println("\nFido's back inside...");
		remote.pressButton();
	}
}
