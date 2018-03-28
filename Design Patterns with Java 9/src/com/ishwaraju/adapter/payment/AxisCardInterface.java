package com.ishwaraju.adapter.payment;

public interface AxisCardInterface {
	public String getCreditCardNumber();

	public void setCreditCardNumber(String creditCardNumber);

	public String getCustomerName();

	public void setCustomerName(String customerName);

	public String getCardExpiryMonthYear();

	public void setCardExpiryMonthYear(String cardExpiryMonth);

	public int getCvvNumber();

	public void setCvvNumber(int cvvNumber);

	public int getAmount();

	public void setAmount(int amount);
}
