package com.monocept.basics;

public class PassByValueTest {
	public static void main(String args[]) {
		int score = 100;
		updateScoreToZero(score);
		System.out.println(score);
		int[] scores = { 100, 90, 80 };
		updateScoresToZero(scores);
		for (int s : scores) {
			System.out.println(s);
		}
	}

	public static void updateScoreToZero(int s) {
		s = 0;
	}

	public static void updateScoresToZero(int[] ss) {
		for (int i = 0; i < ss.length; i++)
			ss[i] = 0;
	}
}
