package com.ishwaraju.bridge.carCompany;

public class CentralLocking implements Product {
	private final String productName;

	public CentralLocking(String productName) {
		super();
		this.productName = productName;
	}

	@Override
	public String productName() {
		return productName;
	}

	@Override
	public void produce() {
		System.out.println("Producing central lock system for the : " + productName);
	}

}
