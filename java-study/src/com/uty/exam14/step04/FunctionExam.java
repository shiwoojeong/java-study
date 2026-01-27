package com.uty.exam14.step04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExam {
	private static List<Student> list = Arrays.asList(new Student("홍길동", 95, 80), new Student("이순신", 90, 70));

	public static void printString(Function<Student, String> function) {
		for (Student student : list) {
			System.out.print(function.apply(student) + " ");
		}
		System.out.println();
	}

	public static void printInt(ToIntFunction<Student> function) {
		for (Student student : list) {
			System.out.println(function.applyAsInt(student));
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Function<Student, String> function = new Function<Student, String>() {
			@Override
			public String apply(Student s) {
				return s.getName();
			}
		};

		ToIntFunction<Student> math = new ToIntFunction<Student>() {

			@Override
			public int applyAsInt(Student value) {
				return value.getMathScore();
			}
		};

		ToIntFunction<Student> english = new ToIntFunction<Student>() {

			@Override
			public int applyAsInt(Student value) {
				return value.getEnglishScore();
			}
		};

		printString(function);
		printInt(math);
		printInt(english);
//		System.out.println("[학생 이름]");System.out.println("=============");
//
//		printString(s -> s.getName());
//			
//			System.out.println("[영어 점수]");
//			System.out.println("=============");
//			printInt(s -> s.getEnglishScore());
//			
//			System.out.println("[수학 점수]");
//			System.out.println("=============");
//			printInt(s -> s.getMathScore());
	}

}
