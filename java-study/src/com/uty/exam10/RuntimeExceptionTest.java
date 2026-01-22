package com.uty.exam10;

public class RuntimeExceptionTest {
	public static void main(String[] args) {
		String s = null;

		try {
			System.out.println("s의 길이: " + s.length());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("문자열 변수 s가 null입니다.");
		}

//		int[] numbers = {1, 2, 3, 4, 5};
//		System.out.println("numbers[5]: " + numbers[5]);
	}
}
