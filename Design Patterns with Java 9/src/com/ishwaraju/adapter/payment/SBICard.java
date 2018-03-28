package com.ishwaraju.adapter.payment;

public class SBICard implements SBICardInterface {
	private String creditCardNumber;
	private String customerName;
	private String cardExpiryMonth;
	private String cardExpiryYear;
	private int cvvNumber;
	private int amount;

	@Override
	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	@Override
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	@Override
	public String getCustomerName() {
		return customerName;
	}

	@Override
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String getCardExpiryMonth() {
		return cardExpiryMonth;
	}

	@Override
	public void setCardExpiryMonth(String cardExpiryMonth) {
		this.cardExpiryMonth = cardExpiryMonth;
	}

	@Override
	public String getCardExpiryYear() {
		return cardExpiryYear;
	}

	@Override
	public void setCardExpiryYear(String cardExpiryYear) {
		this.cardExpiryYear = cardExpiryYear;
	}

	@Override
	public int getCvvNumber() {
		return cvvNumber;
	}

	@Override
	public void setCvvNumber(int cvvNumber) {
		this.cvvNumber = cvvNumber;
	}

	@Override
	public int getAmount() {
		return amount;
	}

	@Override
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
