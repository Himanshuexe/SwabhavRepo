package com.monocept.singleton.test;

import com.monocept.singleton.DataService;

public class SingletonThreadTest {

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			DataService instance1 = DataService.getInstance();
			instance1.doWork();
		});
		Thread t2 = new Thread(() -> {
			DataService instance2 = DataService.getInstance();
			instance2.doWork();
		});
		Thread t3 = new Thread(() -> {
			DataService instance3 = DataService.getInstance();
			instance3.doWork();
		});

		t1.start();
		t2.start();
		t3.start();
	}
}