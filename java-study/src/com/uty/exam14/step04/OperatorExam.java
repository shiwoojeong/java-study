package com.uty.exam14.step04;

import java.util.function.IntBinaryOperator;

public class OperatorExam {
	public static int getMinMax(IntBinaryOperator operator, int[] array) {
		int result = array[0];
		for (int num : array) {
			result = operator.applyAsInt(result, num);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] scores = { 82, 96, 86, 97, 100, 91, 89, 93 };

		int max = getMinMax((a, b) -> a >= b ? a : b, scores);
		System.out.println("Max: " + max);
		
		int min = getMinMax((a, b) -> a < b ? a : b, scores);
		System.out.println("Min: " + min);
	}
}
