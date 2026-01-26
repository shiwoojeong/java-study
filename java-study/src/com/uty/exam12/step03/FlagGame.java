package com.uty.exam12.step03;

public class FlagGame {
public static void main(String[] args) {
//	Thread thread = new FlagThread();
	
	Thread thread = new Thread() {

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println("백기");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
		
	};
	thread.start();
	
	
	for (int i = 0; i < 10; i++) {
		System.out.println("청기");
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
}
