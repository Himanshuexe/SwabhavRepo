package com.monocept.test;

import com.monocept.model.*;

public class AccountTest {
	public static void main(String[] args) {
//		caseStudy1();
		caseStudy2();
	}

	public static void caseStudy1() {
		Account acc1 = new Account(101, "Abc", 1000);
		acc1.withdraw(501);
		printDetails(acc1);
	}

	public static void caseStudy2() {
		try {
			caseStudy1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void printDetails(Account acc) {
		System.out.println(
				"Account no.: " + acc.getAccNo() + ", Name: " + acc.getName() + ", Balance: " + acc.getBalance());
	}
}
