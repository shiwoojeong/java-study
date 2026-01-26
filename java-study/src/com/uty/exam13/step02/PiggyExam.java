package com.uty.exam13.step02;

public class PiggyExam {
	public static void main(String[] args) {
		// 뒤쪽 Integer 생략 가능
		GenericPiggyBank<Integer> intPiggy = new GenericPiggyBank<Integer>();
		intPiggy.setMoney(1000);
		int i = intPiggy.getMoney();
		System.out.println(i);

		GenericPiggyBank<Double> doublePiggy = new GenericPiggyBank<Double>();
		doublePiggy.setMoney(100.3);
		double d = doublePiggy.getMoney();
		System.out.println(d);

		GenericPiggyBank<Apple> applePiggy = new GenericPiggyBank<Apple>();
		applePiggy.setMoney(new Apple());
		Apple a = applePiggy.getMoney();
		System.out.println(a);
	}
}
