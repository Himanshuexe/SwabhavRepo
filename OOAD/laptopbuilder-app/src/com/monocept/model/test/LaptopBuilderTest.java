package com.monocept.model.test;

import com.monocept.model.LaptopBuilder;
import com.monocept.model.LaptopSystem;

public class LaptopBuilderTest {
	public static void main(String[] args) {
		LaptopSystem laptop = new LaptopBuilder()
									.addKeyboard("Logitech")
									.addRam("16gb")
									.addMouse("Dell")
									.addHdd("2tb")
									.addTouchscreen("Yes")
									.getSystem();
		printDetails(laptop);
	}

	public static void printDetails(LaptopSystem lapTop) {
		System.out.println("Laptop details:\nKeyboard: " + lapTop.getKeyboard());
		System.out.println("Ram: " + lapTop.getRam() + "\nMouse: " + lapTop.getMouse());
		System.out.println("Hdd: " + lapTop.getHdd() + "\nTouchscreen: " + lapTop.getTouchScreen());
	}
}
