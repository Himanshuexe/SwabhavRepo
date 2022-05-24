package com.monocept.model;

public enum Mark {
	O, X, EMPTY;

	public String toString() {
		switch (this) {
		case O:
			return "O";
		case X:
			return "X";
		case EMPTY:
			return "EMPTY";
		default:
			return "other";
		}
	}
}
