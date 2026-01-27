package com.uty.exam14.step01;

public class LambdaExam {
	public static void main(String[] args) {
		NoArgNoReturn lambda = () -> {
			String msg = "1: test method";
			System.out.println(msg);
		};
		
		lambda.test();
		
		lambda = () -> {
			System.out.println("1: test method");
		};
		lambda.test();
		lambda = () ->System.out.println("1: test method");
		lambda.test();
	}

}
