package com.uty.exam07.step04;

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
