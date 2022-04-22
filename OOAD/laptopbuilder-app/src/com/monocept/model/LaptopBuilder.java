package com.monocept.model;

public class LaptopBuilder {
	private LaptopSystem laptop;

	public LaptopBuilder() {
		laptop = new LaptopSystem();
	}

	public LaptopBuilder addKeyboard(String type) {
		laptop.setKeyboard(type);
		return this;
	}

	public LaptopBuilder addRam(String type) {
		laptop.setRam(type);
		return this;
	}

	public LaptopBuilder addHdd(String type) {
		laptop.setHdd(type);
		return this;
	}

	public LaptopBuilder addMouse(String type) {
		laptop.setMouse(type);
		return this;
	}

	public LaptopBuilder addTouchscreen(String type) {
		laptop.setTouchScreen(type);
		return this;
	}

	public LaptopSystem getSystem() {
		return laptop;
	}
}
