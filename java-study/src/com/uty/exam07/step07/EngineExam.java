package com.uty.exam07.step07;

public class EngineExam {
	public static void main(String[] args) {
		Engine gas = new GasolineEngine();
		Engine diesel = new DieselEngine();
		Engine hybrid = new HybridEngine();

		SUV gSantafe = new SUV(gas);
		SUV dSantafe = new SUV(diesel);
		SUV hSantafe = new SUV(hybrid);

		gSantafe.drive();
		dSantafe.drive();
		hSantafe.drive();
	}

}
