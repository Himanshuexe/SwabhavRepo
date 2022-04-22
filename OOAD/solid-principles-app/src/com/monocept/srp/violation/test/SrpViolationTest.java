package com.monocept.srp.violation.test;

import com.monocept.srp.violation.Invoice;

public class SrpViolationTest {
	public static void main(String[] args) {
		Invoice invoice = new Invoice("01", "Samsung Tv", 100000, 10, 20);
		invoice.printInvoice();
	}
}
