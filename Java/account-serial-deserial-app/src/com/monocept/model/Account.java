package com.monocept.model;

import java.io.Serializable;

public class Account implements Serializable {

	private static final long serialVersionUID = 1L;
	private final int accNo;
	private final transient String name;
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

	public void withdraw(int amount) throws CustomUncheckedException {
		if (this.balance - amount > minBalance) {
			this.balance = balance - amount;
		} else
			throw new CustomUncheckedException("Low Balance");
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
