package com.uty.exam16.step02;

import java.util.Arrays;
import java.util.List;

public class FlatmapExam {
public static void main(String[] args) {
	List<String> list1 = List.of("I am Tom", "You are Jane");
	list1.stream()
	.flatMap(sentence -> Arrays.stream(sentence.split(" ")))
	.forEach(word -> System.out.println(word));
	System.out.println();
	
	List<String> list2 = List.of("1, 2, 3", "4, 5, 6");
	list2.stream()
	.flatMapToInt(data ->{
		String[] strArr = data.split(",");
		int[] intArr = new int[strArr.length];
		for(int i=0;i<strArr.length;i++) {
			intArr[i]=Integer.parseInt(strArr[i].trim());
		}
		return Arrays.stream(intArr);
	}).forEach(n -> System.out.println(n) );
	 	 
}

}
