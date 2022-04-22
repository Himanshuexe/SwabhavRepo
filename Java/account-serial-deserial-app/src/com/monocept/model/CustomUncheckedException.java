package com.monocept.model;

public class CustomUncheckedException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public CustomUncheckedException(String message) {
		super(message);
	}
}