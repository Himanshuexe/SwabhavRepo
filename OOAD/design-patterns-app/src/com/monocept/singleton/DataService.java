package com.monocept.singleton;

public class DataService {
	private static DataService instance;
	private static Object mutex = new Object();

	private DataService() {
		System.out.println("Inside DataService.");
	}

	public static DataService getInstance() {
		DataService result = instance;
		if (result == null) {
			synchronized (mutex) {
				result = instance;
				if (result == null)
					instance = result = new DataService();
			}
		}
		return instance;
	}

	public void printMessage() {
		System.out.println(this.hashCode());
	}

	public void doWork() {
		System.out.println("Method called by: " + this.hashCode());
	}
}
