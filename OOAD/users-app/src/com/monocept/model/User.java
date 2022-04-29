package com.monocept.model;

public class User {
	private int id;
	private String name;
	private String userName;
	private String password;
	private String email;
	private double balance;

	public User(int id, String name, String userName, String password, String email, double balance) {
		this.id = id;
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Id= " + id + ", \nName= " + name + ", \nE-mail= " + email + ", \nBalance= " + balance;
	}
}