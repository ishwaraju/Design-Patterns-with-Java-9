package com.ishwaraju.bridge.carCompany;

public abstract class Car {
	private final Product product;
	private final String carType;

	public Car(Product product, String carType) {
		this.carType = carType;
		this.product = product;
	}

	public abstract void assemble();

	public abstract void produceProduct();

	public void printDetails() {
		System.out.println("Car : " + carType + "Product Name : " + product.productName());
	}
}
