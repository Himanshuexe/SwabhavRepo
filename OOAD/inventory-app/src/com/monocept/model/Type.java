package com.monocept.model;

public enum Type {
	ACCOUSTIC, ELECTRIC;

	public String toString() {
		switch (this) {
		case ACCOUSTIC:
			return "accoustic";
		case ELECTRIC:
			return "electric";
		default:
			return "other";
		}
	}
}