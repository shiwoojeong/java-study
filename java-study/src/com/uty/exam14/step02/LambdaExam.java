package com.uty.exam14.step02;

public class LambdaExam {
	public static void main(String[] args) {
		ArgNoReturn lambda = (x) -> {
			int result = x * 2;
			System.out.println(result);
		};
		lambda.test(10);

		lambda = (x) -> {
			int result = x * 2;
			System.out.println(result);
		};
		lambda.test(10);

		lambda = (x) -> System.out.println(x * 2);
		lambda.test(10);
		
		lambda = x -> System.out.println(x * 2);
		lambda.test(10);
	}

}
