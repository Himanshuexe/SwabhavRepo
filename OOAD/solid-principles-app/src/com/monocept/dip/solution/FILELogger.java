package com.monocept.dip.solution;

public class FILELogger implements ILogger {
	@Override
	public void log(String err) {
		System.out.println("Error logged in File: " + err);
	}
}
