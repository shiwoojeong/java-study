package com.uty.exam05.step03;

public class Car {
	private String manufacturer;

	public Car(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void drive() {
		System.out.println("달린다.");
	}

	public void stop() {
		System.out.println("멈춘다.");
	}

}
