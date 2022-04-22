package com.monocept.srp.solution.test;

import com.monocept.srp.solution.*;

public class SrpSolutionTest {
	public static void main(String[] args) {
		Invoice invoice = new Invoice("01", "Samsung Tv", 100000, 10, 20);
		InvoiceConsolePrinter printer = new InvoiceConsolePrinter();
		printer.printInvoice(invoice);
	}
}
