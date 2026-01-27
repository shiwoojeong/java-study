package com.uty.exam14.step03;

public class LambdaExam {
	public static void main(String[] args) {
		ArgReturn lambda = (x, y) -> {
			int sum = x + y;
			return sum;
		};
		System.out.println(lambda.test(1, 2));

		lambda = (x, y) -> {
			return x + y;
		};
		System.out.println(lambda.test(1, 2));

		lambda = (x, y) -> adder(x, y);
		System.out.println(lambda.test(1, 2));
	}

	public static int adder(int x, int y) {
		return x + y;
	}
}
