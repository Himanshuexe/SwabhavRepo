package com.monocept.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitars = new ArrayList<Guitar>();

	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}

	public void addGuitar(String serialNumber, double price, String model, int numString, Builder builder, Type type,
			Wood backWood, Wood topWood) {
		GuitarSpec spec = new GuitarSpec(builder, model, type, numString, backWood, topWood);
		Guitar guitar = new Guitar(serialNumber, price, spec);
		guitars.add(guitar);
	}

	public Guitar getGuitar(String serialNumber) {
//		for (Guitar guitar : guitars) {
//			Guitar g = guitar++;
//			if (guitar.getSerialNumber() == g.getSerialNumber())
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();
			if (guitar.getSerialNumber().equals(serialNumber))
			{
				return guitar;
			}
		}
		return null;

	}

	public List<Guitar> search(GuitarSpec searchSpec) {
		List<Guitar> matchingGuitars = new LinkedList<Guitar>();

		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();

			if (guitar.getSpec().matches(searchSpec))
				matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}

}