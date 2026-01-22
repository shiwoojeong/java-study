package com.uty.exam07.step06;

public class Bird implements Animal { // Bird는 Animal이라는 인터페이스를 구현하는 클래스

	@Override
	public void sound() {
		System.out.println("짹짹");

	}

	@Override
	public void eat() {
		System.out.println("쪼아 먹다");

	}


}
