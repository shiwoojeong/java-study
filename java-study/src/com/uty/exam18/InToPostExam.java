package com.uty.exam18;

import java.util.HashMap;
import java.util.Map;

public class InToPostExam {
	public static void main(String[] args) {
		String ex1 = "3 + 2 * 4";
//				2 * 4 + 3
//				2 * 1 + 3 / 2
//				2 * 2 / 3
		String ex2 = "2 * 3 * ( 2 + 4 ) + 10";
//				(1 + 2  * 3 ) / 4
//				2 * 3 * ( 2 + 4 ) + 10
//				(1+2)*(3/4)+(5+(6-7)) (1 * 2  + 3 ) / 4

		System.out.println(infixToPostfix(ex1));
		System.out.println(calculate(infixToPostfix(ex1)));
		System.out.println();
		System.out.println(infixToPostfix(ex2));
		System.out.println(calculate(infixToPostfix(ex2)));

	}

	private static String infixToPostfix(String expression) {

		DLLStack<Character> stack = new DLLStack<Character>();
		Map<Character, Integer> priority = new HashMap();
		StringBuilder Postfix = new StringBuilder();
		priority.put('+', 1);
		priority.put('-', 1);
		priority.put('/', 2);
		priority.put('*', 2);
		priority.put('(', 0);

		String[] parts = expression.trim().split("\\s+");

		for (int i = 0; i < parts.length; i++) {
			char ch = parts[i].charAt(0);

			if (ch == '(') {
				stack.push(ch);
			} else if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {
				while (!stack.empty() && priority.get(stack.peek()) >= priority.get(ch)) {
					// 연산자를 뽑을 때 뒤에 공백 추가
					Postfix.append(stack.pop()).append(" ");
				}
				stack.push(ch);
			} else if (ch == ')') {
				while (!stack.empty() && stack.peek() != '(') {
					// 괄호 안의 연산자를 뽑을 때 뒤에 공백 추가
					Postfix.append(stack.pop()).append(" ");
				}
				if (!stack.empty())
					stack.pop();
			} else {
				// 피연산자(숫자)를 추가하고 뒤에 공백 추가
				Postfix.append(parts[i]).append(" ");
			}
		}

		while (!stack.empty()) {
			// 남은 연산자들을 뽑을 때 뒤에 공백 추가
			Postfix.append(stack.pop()).append(" ");
		}

		// 마지막에 남는 불필요한 공백만 제거하여 반환
		return Postfix.toString().trim();
	}

	
	private static int calculate(String infix) {
		String[] parts = infix.trim().split("\\s+");
		DLLStack<Integer> stack = new DLLStack<Integer>();
		for (int i = 0; i < parts.length; i++) {
			String s = parts[i];
			int result = 0;
			if (s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")) {
				int x = stack.pop();
				int y = stack.pop();
				if (s.equals("+")) {
					result = y + x;
				} else if (s.equals("-")) {
					result = y - x;
				} else if (s.equals("/")) {
					result = y / x;
				} else if (s.equals("*")) {
					result = y * x;
				}
				stack.push(result);

			} else {
				stack.push(Integer.parseInt(s));
			}

		}

		return stack.pop();
	}
	
	
	/////////////////////////////////////////////////////////////////////
	private static String infixToPostfix2(String expression) {
		StringBuilder builder = new StringBuilder();

		DLLStack<Character> stack = new DLLStack<Character>();
		char[] arrayExpression = expression.toCharArray();

		for (int i = 0; i < arrayExpression.length; i++) {
			if (arrayExpression[i] == '(') {
				stack.push(arrayExpression[i]);
			} else if (arrayExpression[i] >= '0' && arrayExpression[i] <= '9') {
				builder.append(arrayExpression[i]);
			} else if (arrayExpression[i] == ')') {
				while (stack.peek() != '(') {
					builder.append(stack.pop());
				}
				stack.pop();
			} else {
				if (stack.empty() || stack.peek() == '(') {
					stack.push(arrayExpression[i]);
				} else if (comparePriority(arrayExpression[i], stack.peek()) > 0) {
					stack.push(arrayExpression[i]);
				} else {
					while (stack.size() != 0 && stack.peek() != '(') {
						builder.append(stack.pop());
					}
					stack.push(arrayExpression[i]);
				}
			}
		}
		while (stack.size() != 0) {
			builder.append(stack.pop());
		}
		return builder.toString();
	}

	private static int comparePriority(char a, char b) {
		if (a == '*' || a == '/') {
			if (b == '*' || b == '/') {
				return 0;
			} else {
				return 1;
			}
		} else {
			if (b == '*' || b == '/') {
				return -1;
			} else {
				return 0;
			}
		}
	}
	private static int calculate2(String infix) {
	DLLStack<Integer> intStack = new DLLStack<Integer>();
	char[] postfixExpression = infix.toCharArray();
	int a, b;
	
	for(int i=0; i < postfixExpression.length; i++) {
		switch(postfixExpression[i]) {
		case '*':
			b = intStack.pop();
			a = intStack.pop();
			intStack.push(a*b);
			break;
		case '/':
			b = intStack.pop();
			a = intStack.pop();
			intStack.push(a/b);
			break;
		case '+':
			b = intStack.pop();
			a = intStack.pop();
			intStack.push(a+b);
			break;
		case '-':
			b = intStack.pop();
			a = intStack.pop();
			intStack.push(a-b);
			break;
		default:
			intStack.push(Character.digit(postfixExpression[i], 10));
		}
	}
	return intStack.pop();
	}

}