package com.case1;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest3 {
	public static void main(String[] args) {
		List<Integer> nos = new ArrayList<Integer>();
		nos.add(10);
		nos.add(20);
		nos.add(30);
		printDetails(nos);

		List<Double> doublesNos = new ArrayList<Double>();
		doublesNos.add(10.5);
		doublesNos.add(20.5);
		doublesNos.add(30.5);
		printDetails(doublesNos);

		List<Number> nosList = new ArrayList<Number>();
		addNumbersToList(nosList, 10);
		addNumbersToList(nosList, 10.55);

		List<Object> objectList = new ArrayList<Object>();
		addNumbersToList(objectList, 10);
		addNumbersToList(objectList, 10.55);
		System.out.println("Super type: " + objectList);
	}

	static void addNumbersToList(List<? super Number> values, Number no) {
		values.add(no);
		System.out.println(values.get(0));
	}

	public static void printDetails(List<? extends Number> items) {
		items.forEach(item -> System.out.println(item));
	}
}
