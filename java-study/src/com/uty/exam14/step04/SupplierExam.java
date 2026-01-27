package com.uty.exam14.step04;

import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierExam {
	

	public static void main(String[] args) {
		Supplier<String> lotto = () -> {
			int[] numbers = new int[6];
			StringBuilder builder = new StringBuilder("로또 번호: [");
			int count = 0; // 호출될 때마다 초기화

			while (count < 6) {
				int randomNum = (int) (Math.random() * 45) + 1;
				boolean isDuplicate = false;

				// 중복 검사
				for (int i = 0; i < count; i++) {
					if (numbers[i] == randomNum) {
						isDuplicate = true;
						break;
					}
				}

				// 중복이 아니면 배열에 추가
				if (!isDuplicate) {
					numbers[count] = randomNum;
					count++;
				}
			}
			
			for (int i = 0; i < numbers.length; i++) {
				builder.append(numbers[i]).append(" ");
			}

			return builder.toString().trim(); // 결과 반환
		};
		System.out.println(lotto.get()+"]");
	}
}