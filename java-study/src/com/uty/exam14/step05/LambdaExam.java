package com.uty.exam14.step05;

import java.util.function.ToIntBiFunction;

public class LambdaExam {
	public static void main(String[] args) {
		ToIntBiFunction<String, String> function;
		// a와 b를 대소문자를 구분하지 않고 비교
		function = (a, b) -> a.compareToIgnoreCase(b);
		print(function.applyAsInt("Hello World", "hello world"));
		System.out.println("hello world".compareToIgnoreCase("Hello World"));
		System.out.println();

		function = String::compareToIgnoreCase;
		print(function.applyAsInt("Hello World", "hello world"));

	}

	public static void print(int order) {
		if (order == 0) {
			System.out.println("동일한 문자열입니다.");
		} else
			System.out.println("다른 문자열입니다.");
	}
}
