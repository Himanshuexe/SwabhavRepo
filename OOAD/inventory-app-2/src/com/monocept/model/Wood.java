package com.monocept.model;

public enum Wood {
	INDIAN_ROSEWOOD, BRASILIAN_ROSEWOOD, MAHOGONY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;

	public String toString() {
		switch (this) {
		case INDIAN_ROSEWOOD:
			return "Indian RoseWood";
		case BRASILIAN_ROSEWOOD:
			return "Brasilian rosewood";
		case MAHOGONY:
			return "Mahogony";
		case MAPLE:
			return "Maple";
		case COCOBOLO:
			return "Cocobolo";
		case CEDAR:
			return "Cedar";
		case ADIRONDACK:
			return "Adirondack";
		case ALDER:
			return "Alder";
		case SITKA:
			return "Sitka";
		default:
			return "other";
		}
	}
}