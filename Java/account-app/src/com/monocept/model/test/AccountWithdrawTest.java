package com.monocept.model.test;

import com.monocept.model.Account;

public class AccountWithdrawTest {
	public static void main(String[] args) {
		Account acc1 = new Account(1, "Manoj");
		Account acc2 = new Account(2, "Arun", 2000);
		printDetails(acc1);
		printDetails(acc2);
		acc1.withdraw(500);
		printDetails(acc1);
		acc2.withdraw(200);
		printDetails(acc2);
	}

	public static void printDetails(Account acc) {
		System.out.println(
				"Account no.: " + acc.getAccNo() + ", Name: " + acc.getName() + ", Balance: " + acc.getBalance());
	}
}
