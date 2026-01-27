package com.uty.exam14.step05;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MemberExam {
	public static void main(String[] args) {
		Function<String, Member> function1 = Member::new;
		Member member1 = function1.apply("java");

		BiFunction<String, String, Member> function2 = Member::new;
		Member member2 = function2.apply("java", "python");
	}
}
