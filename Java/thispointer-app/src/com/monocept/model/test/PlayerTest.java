package com.monocept.model.test;

import com.monocept.model.Player;

public class PlayerTest {
	public static void main(String[] args) {
		Player sachin = new Player(1, "Sachin", 45);
		Player virat = new Player(2, "Virat", 35);
		printDetails(sachin);
		printDetails(virat);

		Player elder = sachin.whoIsElder(virat);
		System.out.println("Details of elder: ");
		printDetails(elder);

	}

	public static void printDetails(Player p) {
		System.out.println("Id: " + p.getId());
		System.out.println("Name: " + p.getName());
		System.out.println("Age: " + p.getAge() + "\n");
	}
}
