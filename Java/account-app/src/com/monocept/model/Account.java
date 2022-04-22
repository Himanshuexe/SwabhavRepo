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

	private double validateTransaction(double amount) {
		double transaction = balance - amount;
		if (transaction < minBalance) {
			return balance;
		}
		return transaction;
	}

	public void withdraw(int amount) {
		//this.balance = validateTransaction(amount);
		if (this.balance - amount > minBalance) {
			this.balance=balance-amount;
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
}
