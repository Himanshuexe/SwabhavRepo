package com.monocept.model;

public class NegativeValueNotAllowedException extends RuntimeException {

	private static final long serialVersionUID = 6574219537011380086L;
	String message;

	public NegativeValueNotAllowedException() {
		super();
	}

	public String getMessage() {
		return message;
	}
}
