package com.uty.exam16.step01;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStream {
	//public static은 메소드의 밖에 사용!!
	public static int sum;
	public static void main(String[] args) {
		String[] singers = {"아이유", "로제", "BTS"};
		Stream<String> singerStream = Arrays.stream(singers);
		singerStream.forEach(s -> System.out.println(s));
		int[] sumArray = {0}; //참조형 변수는 실제 값이 저장되지 않고 자료가 저장된 공간의 주소를 저장한다.
		System.out.println();
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(n -> sum += n);
		
		System.out.println("결과: " + sum);
		
	}
}
