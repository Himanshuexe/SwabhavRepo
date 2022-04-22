package com.monocept.model;

public abstract class Account {

	private int accNo;
	private String name;
	protected double balance;

	public Account(int accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		this.balance = balance + amount;
	}

	public abstract void withdraw(int amount);

	public abstract String getAccType();
}
