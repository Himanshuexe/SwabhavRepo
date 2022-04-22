package com.monocept.model.test;

import com.monocept.model.Account;
import com.monocept.model.CurrentAccount;
import com.monocept.model.SavingsAccount;

public class AccountTest {
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount(101, "Himanshu", 2000);
		CurrentAccount ca = new CurrentAccount(111, "Rohit", 50000);
		printDetails(sa);
		printDetails(ca);

		Account[] accounts = new Account[] { new SavingsAccount(102, "Rohan", 5000),
				new CurrentAccount(112, "Rahul", 25000) };
		printDetails(accounts);
	}

	public static void printDetails(Account a) {
		System.out.println("Account No: " + a.getAccNo() + " Name: " + a.getName() + " Balance: " + a.getBalance()
				+ " Account Type: " + a.getAccType());
	}

	public static void printDetails(Account ac[]) {
		for (Account a : ac) {
			printDetails(a);
		}
	}
}
