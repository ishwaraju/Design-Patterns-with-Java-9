package com.ishwaraju.adapter.payment;

public interface SBICardInterface {

	public String getCreditCardNumber();

	public void setCreditCardNumber(String creditCardNumber);

	public String getCustomerName();

	public void setCustomerName(String customerName);

	public String getCardExpiryMonth();

	public void setCardExpiryMonth(String cardExpiryMonth);

	public String getCardExpiryYear();

	public void setCardExpiryYear(String cardExpiryYear);

	public int getCvvNumber();

	public void setCvvNumber(int cvvNumber);

	public int getAmount();

	public void setAmount(int amount);

}
