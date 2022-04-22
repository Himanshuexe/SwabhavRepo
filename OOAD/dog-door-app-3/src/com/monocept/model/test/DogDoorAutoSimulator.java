package com.monocept.model.test;

import com.monocept.model.BarkRecognizer;
import com.monocept.model.DogDoor;
import com.monocept.model.Remote;

public class DogDoorAutoSimulator {
	public static void main(String[] args) {

		DogDoor door = new DogDoor();
		BarkRecognizer recognizer = new BarkRecognizer(door);
		Remote remote = new Remote(door);

		System.out.println("Fido barks to go outside...");
		recognizer.recognize("bark");
		System.out.println("\nFido has gone outside...");
		System.out.println("\nFido's all done...");
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
		}
		System.out.println("...he's stuck outside.");
		System.out.println("Fidp starts barking.");
		recognizer.recognize("bark");
		System.out.println("\nFido's back inside...");
	}
}
