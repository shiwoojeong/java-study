package com.uty.exam11;

public class GetClassExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class clazz = Car.class;

//		Class clazz =Class.forName("com.uty.exam11.Car");

//		Car car =new Car();
//		Class clazz = car.getClass();

		System.out.println("패키지: " + clazz.getPackage().getName());
		System.out.println("클래스 간단 이름: " + clazz.getSimpleName());
		System.out.println("클래스 전체 이름: " + clazz.getName());

	}

}
