package com.monocept.model.test;

import com.monocept.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		Account acc1 = new Account(101, "Abc", 1000);
		System.out.println(acc1.getCounter());
		System.out.println(Account.headCount());
		System.out.println(acc1.hashCode());

		Account acc2 = new Account(102, "pqr");
		System.out.println(acc1.getCounter());
		System.out.println(Account.headCount());
		System.out.println(acc2.hashCode());

		Account acc3 = new Account(103, "lmno");
		System.out.println(acc1.getCounter());
		System.out.println(Account.headCount());
		System.out.println(acc3.hashCode());
	}
}
