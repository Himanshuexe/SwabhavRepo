package com.monocept.model.test;

import com.monocept.model.*;

public class InventoryTest {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		GuitarSpec spec = new GuitarSpec(Builder.COLLINGS, "ADSH", Type.ACCOUSTIC, 6, Wood.ALDER, Wood.CEDAR);
		inventory.addInstrument("10770", 40000, spec);
		System.out.println(inventory.get("10770").toString());
	}
}
