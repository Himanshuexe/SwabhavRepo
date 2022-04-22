package com.monocept.model;

public class InsufficientFundsException extends RuntimeException {
	private Account acc;
	private String detailMessage;

	public InsufficientFundsException(Account acc) {
//		super("Holder of Account no: " + acc.getAccNo() + " named " + acc.getName() + " tried to withdraw "
//				+ acc.getWithdraw() + " but only has " + acc.getBalance() + " in their account."
//				+ "\nIt is bank policy to maintain a minimum balance of 500.0");

		detailMessage = "Holder of Account no: " + acc.getAccNo() + " named " + acc.getName() + " tried to withdraw "
				+ acc.getWithdraw() + " but only has " + acc.getBalance() + " in their account."
				+ "\nIt is bank policy to maintain a minimum balance of 500.0";
	}

	@Override
	public String getMessage() {
		return detailMessage;
	}
}
