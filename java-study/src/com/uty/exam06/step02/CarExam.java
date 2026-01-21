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
//부모 타입의 래퍼런스 변수가 자식의 래퍼런스 변수를 가질 경우 자식의 매소드는 사용 불가능 하지만 오버라이드된 매소드는 사용 가능