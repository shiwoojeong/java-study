package com.uty.exam01;

public class ConvertType {

	public static void main(String[] args) {
		byte byteVal = 10;
		short shortVal = byteVal;
		int intVal = shortVal;
		long longVal = intVal;
		float floatVal = longVal;
		double doubleVal = floatVal;
		
		System.out.println("byteVal: " + byteVal);
		System.out.println("shortVal: " + shortVal);
		System.out.println("intVal: " + intVal);
		System.out.println("longVal: " + longVal);
		System.out.println("floatVal: " + floatVal);
		System.out.println("doubleVal: " + doubleVal);
		
		int i = 128;
		byte b = (byte)i;
		
		System.out.println("i: " + i);
		System.out.println("b: " + b);

	}

}

//int 128의 하위 8비트는 10000000이다.
//byte는 8비트만 저장하므로 이 값만 남는다.
//byte에서 맨 앞의 1은 음수를 의미하며, 10000000은 2의 보수 체계에서 -128을 뜻한다.
//이런 현상을 정수 오버플로우라고 부른다.