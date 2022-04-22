package com.monocept.singleton.test;

import com.monocept.singleton.DataService;

public class SingletonTest {

	public static void main(String[] args) {
		DataService obj1 = DataService.getInstance();
		obj1.printMessage();
		obj1.doWork();

		DataService obj2 = DataService.getInstance();
		obj2.printMessage();
		obj2.doWork();

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

}
