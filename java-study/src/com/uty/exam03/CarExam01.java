package com.uty.exam03;

public class CarExam01 {

	public static void main(String[] args) {
		Car myCar = new Car("sedan", "black");
		Car yourCar = new Car("SUV", "blue");
		Car car = new Car();//기본 생성자가 필요
		
		
		
		myCar.drive();
		yourCar.drive();
		car.drive();
	}

}
