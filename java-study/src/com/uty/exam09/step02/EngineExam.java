package com.uty.exam09.step02;

public class EngineExam {
	public static void main(String[] args) {
		SUV santafe = new SUV(new Engine() {
			
			@Override
			public void runEngine() {
				// TODO Auto-generated method stub
				System.out.println("부르릉~~~~~~");

			}
		});
		SUV sorento = new SUV(new Engine() {
			
			@Override
			public void runEngine() {
				// TODO Auto-generated method stub
				System.out.println("드륵드륵~~~~~~~~");	

			}
		});
		santafe.drive();
		sorento.drive();
	}
}
