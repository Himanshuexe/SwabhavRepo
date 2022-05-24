package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Account {
	@Id
	private int accountNo;
	private String name;
	private double balance;
	private String password;
	@OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
	private List<TranSaction> transactions = new ArrayList<TranSaction>();

	public Account(int accountNo, String name, double balance, String password) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
		this.password = password;
	}

	public void doTransaction(TranSaction transaction) {
		transaction.setAccountNo(this.accountNo);
		if (transaction.getType().equalsIgnoreCase("Deposit")) {
			this.balance = this.balance + transaction.getAmount();
			transactions.add(transaction);
		} else if (transaction.getType().equalsIgnoreCase("Withdraw")) {
			this.balance = this.balance - transaction.getAmount();
			transactions.add(transaction);
		}
	}

	public int getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public String getPassword() {
		return password;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<TranSaction> getTransaction() {
		return transactions;
	}

	public void setTransaction(List<TranSaction> transactions) {
		this.transactions = transactions;
	}

}
