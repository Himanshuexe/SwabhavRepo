package com.exception.test;

public class BugTest {
	public static void main(String[] args) {
		try {
			int firstNo = Integer.parseInt(args[0]);
			int secondNo = Integer.parseInt(args[1]);
			int result = firstNo / secondNo;
			System.out.println("Result is: " + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of bound.");
		}
//		} catch (Exception e) {
//			System.out.println("Exception occured....");
//		} 
		finally {
			System.out.println("Finally executed");
		}

		// catch (ArithmeticException e) {
//			System.out.println("Arithematic Exception occured.");
//		} catch(NumberFormatException e) {
//			System.out.println("Number format Exception");
//		}
		System.out.println("End of Program");
	}
}
