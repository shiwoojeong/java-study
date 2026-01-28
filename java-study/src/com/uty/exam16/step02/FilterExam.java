package com.uty.exam16.step02;

import java.util.List;

public class FilterExam {
	public static void main(String[] args) {
		List<String> names = List.of("아이유", "지드래곤", "지코", "잔나비", "지드래곤");
		
		names.stream()
		.distinct()
		.forEach(n -> System.out.println(n));
		System.out.println();

		names.stream()
		.filter(n -> n.startsWith("지"))
		.forEach(n -> System.out.println(n));
		System.out.println();
		
		names.stream()
		.distinct()
		.filter(n -> n.startsWith("지"))
		.forEach(n -> System.out.println(n));
	}
}
