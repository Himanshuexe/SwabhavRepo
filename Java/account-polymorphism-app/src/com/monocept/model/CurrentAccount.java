package com.monocept.model;

public class CurrentAccount extends Account {

	private static final int minBalance = -10000;

	public CurrentAccount(int accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	@Override
	public void withdraw(int amount) {
		if (this.balance - amount > minBalance) {
			this.balance = balance - amount;
		}
	}

	@Override
	public String getAccType() {
		return "Current Account";
	}
}
