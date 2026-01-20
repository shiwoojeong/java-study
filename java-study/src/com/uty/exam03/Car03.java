package com.uty.exam03;

public class Car03 {
	String model = "new car";
	String color = "white";

	public Car03() {

	}

	public Car03(String model) {
		this.model = model;
	}

	public Car03(String model, String color) {
//		this.model = model;
		this(model); //자신이 가진 생성자로 이동해서 수행함
		this.color = color;
	}

	void drive() {
		System.out.println(model + "(" + color + ")" + " driving~~~~~");
	}
}
