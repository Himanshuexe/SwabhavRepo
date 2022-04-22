package com.monocept.model.test;

import com.monocept.model.Boy;
import com.monocept.model.Infant;
import com.monocept.model.Kid;
import com.monocept.model.Man;

public class ManBoyTest {
	public static void main(String[] args) {
		caseStudy1();
		System.out.println(" ");
		caseStudy2();
		System.out.println(" ");
		caseStudy3();
		System.out.println(" ");
		caseStudy4();
		System.out.println(" ");
		caseStudy5();
	}

	public static void caseStudy1() {
		Man x;
		x = new Man();
		x.read();
		x.play();
	}

	public static void caseStudy2() {
		Boy y;
		y = new Boy();
		y.play();
		y.eat();
		y.read();
	}

	public static void caseStudy3() {
		Man x;
		x = new Boy();
		x.read();
		x.play();
	}

	public static void caseStudy4() {
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());
	}

	public static void atThePark(Man m) {
		m.play();
		System.out.println("at the park.");
	}

	public static void caseStudy5() {
		Object x;
		x = 10;
		System.out.println(x.getClass());
		x = 10.55f;
		System.out.println(x.getClass());
		x = (10 > 5);
		System.out.println(x.getClass());
		x = "Hello";
		System.out.println(x.getClass());
		x = new Man();
		System.out.println(x.getClass());
	}
}