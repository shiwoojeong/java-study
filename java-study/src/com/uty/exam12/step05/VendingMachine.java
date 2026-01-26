package com.uty.exam12.step05;

public class VendingMachine {
	private String order;
	public String getOrder() {
		return order;
	}
	
	// 메소드 전체를 synchronized로 묶는 경우
//	public synchronized void setOrder(String order) {
//		this.order = order;
//		try {
//			Thread.sleep(1000); // 주문 처리시간 소요
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//
//		System.out.println(Thread.currentThread().getName() + " ordered " + getOrder());
//	}

	// 특정 구간만 synchronized로 묶는 경우
	public void setOrder(String order) {
		synchronized (this) {
			this.order = order;
			try {
				Thread.sleep(1000); // 주문 처리시간 소요
			} catch (Exception e) {
				// TODO: handle exception
			}

			System.out.println(Thread.currentThread().getName() + " ordered " + getOrder());

		}
	}

}