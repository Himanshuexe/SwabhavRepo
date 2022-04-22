package com.monocept.model.test;

import java.util.ArrayList;
import java.util.List;

import com.monocept.model.*;

public class InventoryTest {
	public static void main(String[] args) {
		Inventory i = new Inventory();
		i.addGuitar("101", 2000, "1", 6, Builder.COLLINGS, Type.ACCOUSTIC, Wood.ALDER, Wood.CEDAR);
	}
}
