package com.uty.exam16.step02;

import java.util.List;

import com.uty.exam14.step04.Member;

public class MapExam {
public static void main(String[] args) {
	List<Member> members = List.of(
			new Member("홍길동","male", 85), 
			new Member("김유신","male", 95),
			new Member("박문수","male", 80)
			);
	members.stream()
	.mapToInt(Member::getPoint)
	.forEach(p -> System.out.println(p));
}
}
