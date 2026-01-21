package com.uty.exam06.step01;

public class EngineExam {
	public static void main(String[] args) {
		DieselEngine engine = new DieselEngine();
		SUV santafe = new SUV(engine);

		santafe.drive();
		
		GasolineEngine gEngine = new GasolineEngine();
		SUV2 santafe2 = new SUV2(gEngine);
		
		santafe2.drive();
	}
}
