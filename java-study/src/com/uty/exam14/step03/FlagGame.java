package com.uty.exam14.step03;

public class FlagGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Runnable flagTask = new FlagTask();
//		Thread thread = new Thread(flagTask);

		Thread thread = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("백기");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
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
