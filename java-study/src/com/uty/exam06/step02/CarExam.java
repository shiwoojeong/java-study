package com.uty.exam06.step02;

import java.awt.SystemColor;

public class CarExam {
	public static void main(String[] args) {
		Car car = new Car("현대");
		Car mustang = new Convertible("포드", "yellow");
		Car truck = new Truck("현대");
		
		System.out.println(mustang.getManufacturer());
		System.out.println(truck.getManufacturer());
		
//		mustang.openRoof();
		
		mustang.drive();
		truck.drive();
	}
}
