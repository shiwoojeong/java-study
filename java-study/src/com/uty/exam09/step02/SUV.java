package com.uty.exam09.step02;

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
