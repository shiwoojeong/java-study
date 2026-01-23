package com.uty.exam11;

public class MainArgs {
public static void main(String[] args) {
	if(args.length != 2) {
		System.out.println("프로그램 사용법");
		System.out.println("java 프로그램명 인자1 인자2");
		System.exit(0);
	}
	
	int num1 = Integer.parseInt(args[0]);
	int num2 = Integer.parseInt(args[1]);
	
	int result = num1 +num2;
	System.out.println(num1 + " + " + num2 + " = " + result);
}
}
