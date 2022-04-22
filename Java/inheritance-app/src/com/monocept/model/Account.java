package com.monocept.model;

public class Account {
	private final int accNo;
	private final String name;
	private double balance;
	private static int minBalance = 500;

	public Account(int accNo, String name) {
		this(accNo, name, minBalance);
	}

	public Account(int accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public void withdraw(int amount) {
		if (this.balance - amount > minBalance) {
			this.balance = balance - amount;
		}
	}

	public String getName() {
		return name;
	}

	public int getAccNo() {
		return this.accNo;
	}

	public double getBalance() {
		return balance;
	}

	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}

	@Override
	public String toString() {
		return super.toString() + " | Name: " + name + " | Account No: " + accNo + " | Balance: " + balance;
	}

	@Override
	public boolean equals(Object obj) {
		Account acc = (Account) obj;
		return (this.name == acc.name && this.accNo == acc.accNo && this.balance == acc.balance);
	}
}
