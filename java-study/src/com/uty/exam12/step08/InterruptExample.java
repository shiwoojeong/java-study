package com.uty.exam12.step08;

public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread();
		thread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO:4 handle exception

		}
		thread.interrupt();
	}
}
