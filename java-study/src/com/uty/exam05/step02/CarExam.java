package com.uty.exam05.step02;

public class CarExam {
	public static void main(String[] args) {
		Car car = new Car("현대");
		Convertible mustang = new Convertible("포드", "yellow");
		Truck truck = new Truck("현대");
		
		car.drive();
		mustang.openRoof();
		truck.connectTrailler();
		
		mustang.drive();
		truck.drive();
		
	}
}
