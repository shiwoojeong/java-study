package com.uty.exam06.step01;

public class SUV {
	private DieselEngine engine;
	
	public SUV(DieselEngine engine) {
		super();
		this.engine = engine;
	}

	public void drive() {
		engine.runEngine();
	}
}
