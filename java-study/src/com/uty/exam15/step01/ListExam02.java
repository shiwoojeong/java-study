package com.uty.exam15.step01;

import java.util.ArrayList;
import java.util.List;

public class ListExam02 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
//		list.remove(2);
//		for(int a:list) {
//			System.out.println(a);
//		}
		
		list.remove(list.indexOf(2));
//		Integer a =2;
//		list.remove(a);
		for(int i:list) {
			System.out.println(i);
		}
	}

	
}
