package com.monocept.observer.test;

import com.monocept.publisher.Account;
import com.monocept.subscribers.EmailNotifier;
import com.monocept.subscribers.SmsNotifier;

public class Test {
	public static void main(String[] args) {
		Account acc1 = new Account(101, "Himanshu", 5000);
		acc1.registerNotifier(new SmsNotifier());
		acc1.registerNotifier(new EmailNotifier());
		acc1.deposit(500);
		acc1.withdraw(1000);
	}
}
