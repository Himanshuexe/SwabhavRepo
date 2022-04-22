package com.monocept.isp.violation.test;

import com.monocept.isp.violation.IWorker;
import com.monocept.isp.violation.Manager;
import com.monocept.isp.violation.Robot;

public class ISPViolationTest {
	public static void main(String[] args) {
		Manager m = new Manager();
		Robot r = new Robot();

		atTheWorkStatiion(m);
		atTheWorkStatiion(r);

		atTheCafeteria(m);
		atTheCafeteria(r);
	}

	public static void atTheWorkStatiion(IWorker obj) {
		System.out.println("At the WorkStation...");
		obj.startWork();
		obj.stopWork();
	}

	public static void atTheCafeteria(IWorker obj) {
		System.out.println("\nAt the Cafeteria...");
		obj.startEat();
		obj.stopEat();
	}
}
