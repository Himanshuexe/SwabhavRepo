package com.monocept.srp.solution;

public class InvoiceConsolePrinter {

	public static void printInvoice(Invoice invoice) {
		System.out.println("Invoice Id: " + invoice.getId() + "\nDescription: " + invoice.getDescription()
				+ "\nAmount: " + invoice.getAmount() + "\nDiscount: " + invoice.calculateDiscount() + "\nTax: "
				+ invoice.calculateTax() + "\nTotal: " + invoice.calculateTotal());
	}
}
