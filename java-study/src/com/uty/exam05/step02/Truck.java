package com.uty.exam05.step02;

public class Truck extends Car {

	public Truck(String manufacture) {
		super(manufacture);
		// TODO Auto-generated constructor stub
	}

	public void connectTrailler() {
		System.out.println("트레일러 연결");
	}

	public void disconnectTrailler() {
		System.out.println("트레일러 해제");
	}

}

//자식 부모간에서 자식 클래스에는 부모 클래스에 생성자를 호출하는 super가 있어야한다.
