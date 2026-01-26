package com.uty.exam13.step03;

public class Util2 {
	//타입의 상한선을 둠 
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
	}
}
