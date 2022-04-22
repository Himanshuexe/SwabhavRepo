package com.monocept.model;

public class Account {

	private int accNo;
	private String name;
	protected Double balance;
	private int minBalance = 500;

	public Account(int accNo, String name, Double balance) {
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

	public Double getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		this.balance = balance + amount;
	}

	public void withdraw(int amount) {
		if (this.balance - amount > minBalance) {
			this.balance = balance - amount;
		}
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
}
