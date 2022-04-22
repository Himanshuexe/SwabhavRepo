package com.monocept.publisher;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private final int accNo;
	private final String name;
	private double balance;
	public List<INotifier> notifiers = new ArrayList<>();

	public static int minbalance = 500;

	public Account(int accnum, String name, double balance) {
		this.accNo = accnum;
		this.name = name;
		this.balance = balance;
	}

	public int getAccNo() {
		return this.accNo;
	}

	public String getName() {
		return this.name;
	}

	public double getBalance() {
		return this.balance;
	}

	public void withdraw(double amount) {
		if (this.balance - amount > minbalance)
			this.balance -= amount;
		sendMessage();
	}

	public double deposit(double amount) {
		this.balance += amount;
		sendMessage();
		return this.balance;
	}

	public void registerNotifier(INotifier newNotifier) {
		this.notifiers.add(newNotifier);
	}

	private void sendMessage() {
		for (INotifier n : notifiers) {
			n.notify(this);
		}
	}
}
