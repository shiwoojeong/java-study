package com.uty.exam07.step06;

public interface Animal {
	String name = "동물"; // public static final 상수

	public void sound(); // public abstract 추상 메소드
//	public void eat(); 

	public default void eat() { // 특정 구현 클래스에서 메소드를 구현 할 필요없을 경우 default 메소드를 사용
		System.out.println("먹다");
	}
}
