package com.uty.exam06.step01;

public class SUV2 {
	private GasolineEngine engine;
	
	public SUV2(GasolineEngine engine) {
		super();
		this.engine = engine;
	}

	public void drive() {
		engine.runEngine();
	}
}
