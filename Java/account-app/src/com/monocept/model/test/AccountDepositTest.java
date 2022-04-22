package com.monocept.model.test;

import com.monocept.model.Account;

public class AccountDepositTest {
	public static void main(String[] args) {
		Account acc1 = new Account(1, "Manoj");
		Account acc2 = new Account(2, "Arun", 1500);
		printDetails(acc1);
		printDetails(acc2);
		acc1.deposit(500);
		printDetails(acc1);
		acc2.deposit(2000);
		printDetails(acc2);
		System.out.println(acc1);
		System.out.println(acc1.toString());
	}

	public static void printDetails(Account acc) {
		System.out.println(
				"Account no.: " + acc.getAccNo() + ", Name: " + acc.getName() + ", Balance: " + acc.getBalance());
	}
}
