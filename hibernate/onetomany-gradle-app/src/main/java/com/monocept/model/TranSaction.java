package com.monocept.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TranSaction {
	@Id
	private int AccountNo;
	private double amount;
	private String type;
	
	@ManyToOne
	@JoinColumn(name = "accountNo")
	private Account account;

	public TranSaction(double amount, String type) {
		this.amount = amount;
		this.type = type;
	}

	public int getAccountNo() {
		return AccountNo;
	}

	public void setAccountNo(int accountNo) {
		AccountNo = accountNo;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
