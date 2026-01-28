package com.uty.exam16.step03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import com.uty.exam14.step04.Member;

public class StudentExam {
	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] {5, 2, 3, 1, 4});
		intStream.sorted().forEach(n -> System.out.print(n+" "));
		System.out.println();
		
		List<Student> students = List.of(
				new Student("홍길동", 85), 
				new Student("김유신", 95),
				new Student("박문수", 70)
				);
		students.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
		System.out.println();
		
		
		
		
	}
}
