package com.uty.exam16.step02;

import java.util.List;

import com.uty.exam14.step04.Member;

public class PipeExam {
	public static void main(String[] args) {
		List<Member> members = List.of(
				new Member("홍길동","male", 85), 
				new Member("김유신","male", 95),
				new Member("박문수","male", 80)
				);
		//리덕션
		double avg = members.stream()
				.mapToInt(Member::getPoint)
				.average()
				.getAsDouble();
		System.out.println("평균: " + avg);
	}
}
