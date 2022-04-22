package com.monocept.basics;

public class CmdLineArgsTest {
	public static void main(String args[]) {

		int sum = 0;
		int max = Integer.parseInt(args[0]);
		int min = max;
		for (String n : args) {
			int i = Integer.parseInt(n);
			sum = sum + i;
			if (max < i) {
				max = i;
			}
			if (min > i) {
				min = i;
			}
		}
		System.out.println("The entered data is: ");
		for (String x : args) {
			System.out.println(x);
		}
		System.out.println("The sum is: " + sum);
		System.out.println("The average is: " + (double) sum / args.length);
		System.out.println("The minimum is: " + min);
		System.out.println("The maximum is: " + max);
	}
}