package com.monocept.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
	private String transactionId;
	private double transactionAmount;
	private TransactionType transactionType;

	public Transaction(double transactionAmount, TransactionType transactionType) {
		this.transactionId = generateTransactionId();
		this.transactionAmount = transactionAmount;
		this.transactionType = transactionType;
	}

	public String generateTransactionId() {
		DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss:SSS");
		LocalDateTime id = LocalDateTime.now();
		this.transactionId = dateTime.format(id);
		return transactionId;
	}

	public double getTransactionAmount() {
		return transactionAmount;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	@Override
	public String toString() {
		return "Transaction Id: " + generateTransactionId() + " Transaction Amount: " + getTransactionAmount()
				+ " Transaction Type: " + getTransactionType() + "\n";
	}
}
