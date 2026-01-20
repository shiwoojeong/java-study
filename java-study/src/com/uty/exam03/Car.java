package com.uty.exam03;

public class Car {
	String model = "new car";
	String color = "white";
	
	public Car(String inputModel, String inputColor) { // 생성자
		model = inputModel;
		color = inputColor;
	}
	void drive() {
		System.out.println(model + "(" + color + ")" + " driving~~~~~");
	}
}
