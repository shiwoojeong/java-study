package com.uty.exam15.step01;

import java.util.ArrayList;
import java.util.List;

public class ListExam01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("java");
		list.add("c++");
		list.add("Python");
		list.add("c#");
		list.add("Objective-c");

		int size = list.size();
		System.out.println("총 데이터: " + size);
		System.out.println();

		String item = list.get(2);
		System.out.println("인덱스 2: " + item);
		System.out.println();
		
		for(String s:list) {
			System.out.println(s);
		}
		
		System.out.println();
		list.remove(2);
		list.remove(2);
		list.remove("c++");

		for(String s:list) {
			System.out.println(s);
		}

	}
}
