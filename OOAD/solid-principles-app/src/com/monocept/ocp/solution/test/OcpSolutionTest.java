package com.monocept.ocp.solution.test;

import com.monocept.ocp.solution.HoliFestivalRate;
import com.monocept.ocp.solution.FixedDeposit;

public class OcpSolutionTest {
	public static void main(String[] args) {
		FixedDeposit fd1 = new FixedDeposit("Himanshu", 100000, 10, new HoliFestivalRate());
		printDetails(fd1);

		FixedDeposit fd2 = new FixedDeposit("Rohan", 200000, 8, () -> {
			System.out.println("Diwali Festival");
			return 11f;
		});
		printDetails(fd2);

		FixedDeposit fd3 = new FixedDeposit("Abhishek", 500000, 5, OcpSolutionTest::ramzanFestival);
		printDetails(fd3);
	}

	static float ramzanFestival() {
		System.out.println("Ramzan Festival");
		return 12f;
	}

	public static void printDetails(FixedDeposit fd) {
		System.out.println("Principal: " + fd.getPrincipal() + "\nRate: " + fd.getRate() + "\nDuration: "
				+ fd.getDuration() + "\nInterest: " + fd.calculateSimpleInterest() + "\n");
	}
}
