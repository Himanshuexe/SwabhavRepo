package com.monocept.model;

public abstract class Instrument {
	protected String serialNumber;
	protected double price;
	protected InstrumentSpec spec;

	public Instrument(String serialNumber, double price, InstrumentSpec spec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double newPrice) {
		this.price = newPrice;
	}

	public InstrumentSpec getInstrumentSpec() {
		return spec;
	}

	@Override
	public String toString() {
		return "Serial Number: " + getSerialNumber() + " Price: " + getPrice() + " Spec>> " + getInstrumentSpec();
	}
}
