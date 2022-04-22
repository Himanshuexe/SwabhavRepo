package com.monocept.model;

public class SavingsAccount extends Account {

	private static final int minBalance = 500;

	public SavingsAccount(int accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	@Override
	public void withdraw(int amount) {
		if (this.balance - amount > minBalance) {
			this.balance = this.balance - amount;
		}
	}

	@Override
	public String getAccType() {
		return "Savings Account.";
	}
}