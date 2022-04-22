package com.monocept.model.test;

import com.monocept.model.*;

public class MBTest {
	public static void main(String[] args) {
		Man man = new Man();
		Boy boy = new Boy();
		atTheMovieHall(man);
		atThePartyHall(man);
		atTheMovieHall(boy);
		atThePartyHall(boy);
	}

	public static void atTheMovieHall(IEmotionable obj) {
		System.out.println("At the movies...");
		obj.cry();
		obj.laugh();
	}

	public static void atThePartyHall(IMannerable obj) {
		System.out.println("At the party");
		obj.wish();
		obj.depart();
	}
}
