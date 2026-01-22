package com.uty.exam09.step01;

public class EngineExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine gasolineEngine = new Engine() {
			
			@Override
			public void runEngine() {
				// TODO Auto-generated method stub
				System.out.println("부르릉~~~~~~");
			}
		};
		
		SUV santafe = new SUV(gasolineEngine);
		santafe.drive();
		
		SUV sorento = new SUV(new Engine() {
			
			@Override
			public void runEngine() {
				// TODO Auto-generated method stub
			System.out.println("드륵드륵~~~~~~~~");	
			}
		});
		sorento.drive();
	}

}
