package com.uty.exam16.step01;

import java.util.List;
import java.util.stream.Stream;

import com.uty.exam14.step04.Member;

public class ListStream2 {
	public static void main(String[] args) {
		List<Member> list = List.of(new Member("홍길동", "male", 90), new Member("김철수", "male", 85));
		Stream<Member> stream = list.stream();
		stream.forEach(m -> {
			String name = m.getName();
			int score = m.getPoint();
			System.out.println(name + ": " + score);
		});
	}

}
