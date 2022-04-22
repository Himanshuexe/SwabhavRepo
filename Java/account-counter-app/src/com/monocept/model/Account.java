package com.monocept.model;

public class Account {
	private final int accNo;
	private final String name;
	private double balance;
	private static int counter = 0;
	private static int headCount = 0;
	private static int minBalance = 500;
	
	public Account(int accNo, String name) {
		this(accNo, name, minBalance);
	}

	public Account(int accNo, String name, double balance) {
		System.out.println("Inside constructor.");
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		counter++;
		headCount++;
	}
	
	static {
		System.out.println("Inside Static Block.");
		counter=100;
	}

	public int getCounter() {
		return counter;
	}

	public static int headCount() {
		return headCount;
	}
}
