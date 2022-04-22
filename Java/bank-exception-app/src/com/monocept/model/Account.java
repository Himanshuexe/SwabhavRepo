package com.monocept.model;

public class Account {
	private final int accNo;
	private final String name;
	private double balance;
	private double lastWithdrawnAmount = 0;
	private double withdrawAmount = 0;
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
		this.withdrawAmount = amount;
		if (this.balance - amount < minBalance) {
			throw new InsufficientFundsException(this);
		}
		this.balance = balance - amount;
		this.lastWithdrawnAmount = amount;

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

	public double getLastWithdraw() {
		return lastWithdrawnAmount;
	}

	public double getWithdraw() {
		return withdrawAmount;
	}
}
