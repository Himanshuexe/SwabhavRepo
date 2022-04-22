package com.monocept.model.test;

import com.monocept.model.*;

public class HatDecoratorTest {
	public static void main(String[] args) {
		Hat hat;
		hat = new RibbonedHat(new GoldenHat(new PremiumHat()));
		printDetails(hat);
	}

	public static void printDetails(Hat hat) {
		System.out.println(
				"Name: " + hat.getName() + "\nDescription: " + hat.getDescription() + "\nPrice: " + hat.getPrice());
	}
}
