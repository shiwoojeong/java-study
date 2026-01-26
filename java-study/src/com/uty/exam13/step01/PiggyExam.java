package com.uty.exam13.step01;

public class PiggyExam {
	public static void main(String[] args) {
		IntPiggyBank intPiggy = new IntPiggyBank();
		intPiggy.setMoney(1000);
		System.out.println(intPiggy.getMoney());

		DoublePiggyBank doublePiggy = new DoublePiggyBank();
		doublePiggy.setMoney(50.4);
		System.out.println(doublePiggy.getMoney());

		ObjectPiggyBank objectPiggy = new ObjectPiggyBank();
		objectPiggy.setMoney(5000);
//		int money = (int) objectPiggy.getMoney();
//		System.out.println(money);
		System.out.println(objectPiggy.getMoney());
		objectPiggy.setMoney(100.9);
//		double money2 = (double)objectPiggy.getMoney();
//		System.out.println(money2);
		System.out.println(objectPiggy.getMoney());
	}
}
