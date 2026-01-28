package com.uty.exam16.step04;

import java.util.Comparator;
import java.util.List;

import com.uty.exam16.step03.Student;

public class SortingExam {
public static void main(String[] args) {
	List<Student> students = List.of(
			new Student("홍길동", 80), 
			new Student("김유신", 95),
			new Student("박문수", 70)
			);
	
	students.stream()
	.sorted((s1,s2)-> Integer.compare(s1.getScore(), s2.getScore()))
	.forEach(s->System.out.println(s.getName()+": "+s.getScore()));
}
}
