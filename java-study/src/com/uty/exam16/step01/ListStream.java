package com.uty.exam16.step01;

import java.util.List;
import java.util.stream.Stream;

public class ListStream {
	public static void main(String[] args) {
		List<String> cities = List.of("서울", "대전", "부산");
		for (String city : cities) {
			System.out.println(city);
		}
		System.out.println();

		Stream<String> stream = cities.stream();
		stream.forEach(city -> System.out.println(city));
	}
}
