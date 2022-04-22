package com.monocept.isp.solution.test;

import com.monocept.isp.solution.*;

public class ISPSolutionTest {
	public static void main(String[] args) {
		Manager m = new Manager();
		Robot r = new Robot();

		atTheWorkStatiion(m);
		atTheWorkStatiion(r);

		atTheCafeteria(m);
		atTheCafeteria(r);
	}

	public static void atTheWorkStatiion(IWorkerWork obj) {
		System.out.println("At the WorkStation...");
		obj.startWork();
		obj.stopWork();
	}

	public static void atTheCafeteria(IWorkerEat obj) {
		System.out.println("\nAt the Cafeteria...");
		obj.startEat();
		obj.stopEat();
	}
}
