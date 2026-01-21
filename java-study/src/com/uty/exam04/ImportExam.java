package com.uty.exam04;

import com.uty.exam03.CoffeeMachine;

public class ImportExam {

	public static void main(String[] args) {
		CoffeeMachine machine = new CoffeeMachine();

		machine.makeCoffee();
		machine.addShot(1);
		machine.addCream();
		machine.addShot(100);
		machine.addSugar(100);

		System.out.println(machine.getProduction());

	}
}
