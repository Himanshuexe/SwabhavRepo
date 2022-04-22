package com.monocept.model;

public class OddEvenGenerator {
	int size;

	public int[] getEvenNosTill(int limit) {
		if (limit < 0) {
			throw new NegativeValueNotAllowedException();
		}
		int size = limit / 2;
		int[] evnos = new int[size];
		for (int no = 2, index = 0; no <= limit; no += 2, index++) {
			evnos[index] = no;
		}
		return evnos;
	}

	public int[] getOddNosTill(int limit) {
		if (limit < 0) {
			throw new NegativeValueNotAllowedException();
		}
		size = limit / 2;
		if (limit % 2 != 0) {
			size = (limit + 1 / 2);
		}

		int[] odnos = new int[size];
		for (int no = 1, index = 0; no <= limit; no += 2, index++) {
			odnos[index] = no;
		}
		return odnos;
	}
}
