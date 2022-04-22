package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private int accNo;
	private String name;
	protected double balance;
	private int minBalance = 500;
	private List<Transaction> transactions = new ArrayList<Transaction>();

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
		Transaction deposit = new Transaction(amount, TransactionType.DEPOSIT);
		transactions.add(deposit);
	}

	public void withdraw(int amount) {
		if (this.balance - amount > minBalance) {
			this.balance = balance - amount;
			Transaction withdraw = new Transaction(amount, TransactionType.WITHDRAW);
			transactions.add(withdraw);
		}
	}

	public String getTransactions() {
		return transactions.toString();
	}
}
