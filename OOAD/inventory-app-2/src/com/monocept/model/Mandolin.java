package com.monocept.model;

public class Mandolin extends Instrument {
	MandolinSpec spec;

	public Mandolin(String serialNumber, double price, MandolinSpec spec) {
		super(serialNumber, price, spec);
	}

	public MandolinSpec getSpec() {
		return spec;
	}
}
