package com.ishwaraju.adapter.payment;

public class TestAdapterPattern {
	public static void main(String[] args) {
		SBICard sbiCard = new SBICard();
		sbiCard.setCustomerName("ISHWAR KUMAR");
		sbiCard.setCreditCardNumber("XXXX XXXX XXXX XXXX");
		sbiCard.setCardExpiryMonth("MM");
		sbiCard.setCardExpiryYear("YYYY");
		sbiCard.setAmount(200);
		sbiCard.setCvvNumber(100);

		AxisCardInterface axisCardInterface = new SBIToAxisAdapter(sbiCard);

		disaplyAxisCard(axisCardInterface);
	}

	public static void disaplyAxisCard(AxisCardInterface axisCardInterface) {
		System.out.println(axisCardInterface.getCustomerName());
		System.out.println(axisCardInterface.getCreditCardNumber());
		System.out.println(axisCardInterface.getCvvNumber());
		System.out.println(axisCardInterface.getCardExpiryMonthYear());
		System.out.println(axisCardInterface.getAmount());
	}

}
