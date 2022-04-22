package com.monocept.model.test;

import com.monocept.model.*;

public class OddEvenGeneratorTest {
	public static void main(String[] args) {
		OddEvenGenerator generator = new OddEvenGenerator();
		int[] odNums = generator.getOddNosTill(13);
		for (Integer num : odNums) {
			System.out.println(num);
		}
	}
}
