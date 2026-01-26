package com.uty.exam13.step03;

public class PairExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<Integer,String> p1 = new Pair<Integer, String>(1,"Java");
		Pair<Integer,String> p2 = new Pair<Integer, String>(1,"Java");
		boolean result1 = Util.<Integer, String>compare(p1, p2);
		if(result1) {
			System.out.println("p1과 p2는 같다.");
		}
		else {
			System.out.println("p1과 p2는 다르다.");
		}
		Pair<String,String> p3 = new Pair<String, String>("홍길동","Java");
		Pair<String,String> p4 = new Pair<String, String>("이순신","Java");
		
		boolean result2 = Util.compare(p3,p4);
		
		if(result2) {
			System.out.println("p3과 p4는 같다.");
		}
		else {
			System.out.println("p3과 p4는 다르다.");
		}
		
		
	}

}
