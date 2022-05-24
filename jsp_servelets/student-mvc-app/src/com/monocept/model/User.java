package com.monocept.model;

public class User {
	private int id;
	private String password;
	private String name;
	private String email;
	private boolean isActive;

	public User(int id, String password, String name, String email, boolean isActive) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.isActive = isActive;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public boolean isActive() {
		return isActive;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}
}
