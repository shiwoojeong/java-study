package com.uty.exam06.step03;

public class SUV {
	private Engine engine;

	public SUV(Engine engine) {
		super();
		this.engine = engine;
	}

	public void drive() {
		engine.runEngine();
	}

}
