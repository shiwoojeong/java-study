package com.uty.exam05.step02;

public class Car {
	private String manufacture;

	public Car(String manufacture) {
		this.manufacture = manufacture;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void drive() {
		System.out.println("달린다.");
	}

	public void stop() {
		System.out.println("멈춘다.");
	}

}
