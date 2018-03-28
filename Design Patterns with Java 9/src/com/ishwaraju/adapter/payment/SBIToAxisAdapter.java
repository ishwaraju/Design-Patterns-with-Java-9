package com.ishwaraju.adapter.payment;

public class SBIToAxisAdapter implements AxisCardInterface {
	private String creditCardNumber;
	private String customerName;
	private String cardExpiryMonthYear;
	private int cvvNumber;
	private int amount;

	private final SBICard sbiCard;

	public SBIToAxisAdapter(SBICard sbiCard) {
		this.sbiCard = sbiCard;
		setProperties();
	}

	private void setProperties() {
		setCustomerName(this.sbiCard.getCustomerName());
		setCreditCardNumber(this.sbiCard.getCreditCardNumber());
		setCvvNumber(this.sbiCard.getCvvNumber());
		setAmount(this.sbiCard.getAmount());
		setCardExpiryMonthYear(this.sbiCard.getCardExpiryMonth() + "/" + this.sbiCard.getCardExpiryYear());
	}

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
	public String getCardExpiryMonthYear() {
		return cardExpiryMonthYear;
	}

	@Override
	public void setCardExpiryMonthYear(String cardExpiryMonthYear) {
		this.cardExpiryMonthYear = cardExpiryMonthYear;
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
