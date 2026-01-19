package com.uty.exam01;

public class OpTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 11;
		String s = "Windows " + num;
		System.out.println(s);
		
		num += 10;
		System.out.println("num + 10: " + num);
		
		num++;
		System.out.println("num++ : " + num);
		
		int result = num++ + 10; //현재 num값인 22와 10을 먼저 더하고 결과값 32를 result에 대입하고 num을 1 증가시켜 23으로 만듬
		System.out.println("result : " + result);
		System.out.println("num : " + num);
		
		result = ++num + 10;
		System.out.println("result : " + result);
		System.out.println("num : " + num);
	}

}
