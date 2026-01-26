package com.uty.exam13.step03;

public class Util {
	//static이 있으면 다른 클래스에서 객체를 만들지 않아도 메소드가 사용가능하다
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
}
