package com.uty.exam15.step01;

import java.util.Arrays;
import java.util.List;

public class ListExam03 {
public static void main(String[] args) {
	List<String> cities = Arrays.asList("서울","대전","대구","부산");
	for(String s:cities) {
		System.out.println(s);
	}

	
	for(String s:cities) {
		System.out.println(s);
	}
	//Arrays.asList로 만든 list는 고정길이라서 데이터 추가시 에러 
//	cities.add("광주");
	
	List<String> colors = List.of("Red", "Green", "Blue");
	for(String s:colors) {
		System.out.println(s);
	}
	
	//List.of로 만든 list는 고정길이라서 데이터 추가시 에러 
//	colors.add("Black");
}
}
