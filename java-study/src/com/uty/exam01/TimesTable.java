package com.uty.exam01;

public class TimesTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단
		System.out.println("<구구단>");
		int num = 3;
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " X " + i + " = " + num * i);
		}
		System.out.println();

		// Nested for loop
		for (int i = 2; i < 10; i++) {
			System.out.println("< " + i + " 단 >");
			for (int k = 1; k < 10; k++) {
				System.out.println(i + " X " + k + " = " + i * k);
			}
			System.out.println();
		}
	}

}
