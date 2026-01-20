package com.uty.exam03;

public class Car {

	String model = "new car";
	String color = "white";

	public Car() {
	};// 기본 생성자

	public Car(String inputModel, String inputColor) { // 생성자
		model = inputModel;
		color = inputColor;
	}

//	public Car(String model, String color) {
//		super();
//		this.model = model;
//		this.color = color;
//	}

	void drive() {
		System.out.println(model + "(" + color + ")" + " driving~~~~~");
	}
}
