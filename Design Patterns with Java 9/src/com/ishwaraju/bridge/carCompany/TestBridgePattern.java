package com.ishwaraju.bridge.carCompany;

public class TestBridgePattern {

	public static void main(String[] args) {
		Product product = new CentralLocking("Central Lock System");
		Product product2 = new GearLocking("Gear Lock System");
		Car car = new BMW(product, "A series");
		car.produceProduct();
		car.assemble();
		car.printDetails();

		car = new BMW(product2, "Z series");
		car.produceProduct();
		car.assemble();
		car.printDetails();

		car = new Audi(product, "AUDI X");
		car.produceProduct();
		car.assemble();
		car.printDetails();

		car = new Audi(product2, "AUDI C");
		car.produceProduct();
		car.assemble();
		car.printDetails();
	}

}
