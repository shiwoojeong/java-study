package com.uty.exam01;

public class OpTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num01 = 1, num02 = 2, num03 = 3;

		boolean result = num01 < num02 && num02 < 10;
		System.out.println("num01 < num02 && num02 < 10: " + result);
		result = num01 < num02 & num02 < 10;
		System.out.println("num01 < num02 & num02 < 10: " + result);

		result = num01 < num02 || num02 > 10;
		System.out.println("result = num01 < num02 || num02 > 10: " + result);
		result = num01 < num02 | num02 > 10;
		System.out.println("result = num01 < num02 | num02 > 10: " + result);

		result = num01 < num02 ^ num02 < 10;
		System.out.println("result = num01 < num02 ^ num02 < 10: " + result);

		result = !(num01 < num02);
		System.out.println("result = !(num01 < num02): " + result);
	}

}

