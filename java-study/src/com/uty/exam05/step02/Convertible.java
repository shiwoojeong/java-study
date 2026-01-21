package com.uty.exam05.step02;

public class Convertible extends Car {
	private String color;

	public Convertible(String manufacture, String color) {
		super(manufacture);
		this.color = color;
	}
	
	public void openRoof() {
		System.out.println("뚜겅 연다.");
	}
	
	public void closeRoof() {
		System.out.println("뚜껑 닫는다.");
	}

}
