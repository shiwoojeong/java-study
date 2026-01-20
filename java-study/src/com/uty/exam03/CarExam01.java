package com.uty.exam03;

public class CarExam01 {

	public static void main(String[] args) {
		Car myCar = new Car("sedan", "black");
		Car yourCar = new Car("SUV", "blue");
		
		myCar.drive();
		yourCar.drive();
	}

}
