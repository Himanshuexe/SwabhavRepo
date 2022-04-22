package com.monocept.subscribers.test;

import com.monocept.publisher.*;
import com.monocept.subscribers.*;

public class Test {
	public static void main(String[] args) {
		Account acc1 = new Account(101, "Himanshu", 5000);
		acc1.registerNotifier(new SmsNotifier());
		acc1.registerNotifier(new EmailNotifier());
		acc1.deposit(1000);
		acc1.withdraw(2000);
	}
}
