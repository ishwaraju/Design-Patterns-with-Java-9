package com.ishwaraju.bridge.carCompany;

public class Audi extends Car {
	private final Product product;
	private final String carType;

	public Audi(Product product, String carType) {
		super(product, carType);
		this.product = product;
		this.carType = carType;
	}

	@Override
	public void assemble() {
		System.out.println("Assebling product :" + product.productName() + "for Car : " + carType);
	}

	@Override
	public void produceProduct() {
		product.produce();
		System.out.println("Modifying the product :" + product.productName() + "for Car : " + carType);
	}

}
