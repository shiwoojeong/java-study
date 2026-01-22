package com.uty.exam10;

public class TryFinallyTest {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		try {
			System.out.println("numbers[4]: " + numbers[4]);
			System.out.println("numbers[5]: " + numbers[5]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally { // 무조건 실행
			System.out.println("공통 실행");
		}
	}
}
