package com.uty.exam18;

public class CheckParen {
	public static void main(String[] args) {
		String expression = "[ a { b + c - ( a * 3 ) } + 4 ]";
		System.out.println(checkMatch(expression));

		expression = "[ a { b + c - ( a * 3 ) + 4 ]";
		System.out.println(checkMatch(expression));
	}

	public static boolean checkMatch(String expression) {
		DLLStack<Character> stack = new DLLStack<Character>();
		boolean bool = true;
		for (int i = 0; i < expression.length(); i++) {
			if (expression.charAt(i) == '[' || expression.charAt(i) == '{' || expression.charAt(i) == '(') {
				stack.push(expression.charAt(i));
			} else if (expression.charAt(i) == ']' || expression.charAt(i) == '}' || expression.charAt(i) == ')') {
				if (stack.empty())
					return false;
				char ch = stack.pop();
				if (expression.charAt(i) == ']' && ch == '[') {
					bool = true;
				} else if (expression.charAt(i) == '}' && ch == '{') {
					bool = true;
				} else if (expression.charAt(i) == ')' && ch == '(') {
					bool = true;
				} else {
					return false;
				}
			}

		}
		if (!stack.empty())
			return false;
		return bool;

	}

	public static boolean checkMatch2(String expression) {

		boolean retVal = true;
		DLLStack<Character> stack = new DLLStack<Character>();

		char[] arr = expression.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '[' || arr[i] == '{' || arr[i] == '(')
				stack.push(arr[i]);
			else {
				switch (arr[i]) {
				case '}':
					if (stack.empty() || stack.pop() != '{')
						retVal = false;
					break;
				case ']':
					if (stack.empty() || stack.pop() != '[')
						retVal = false;
					break;
				case ')':
					if (stack.empty() || stack.pop() != '(')
						retVal = false;
					break;
				}
				if (!retVal)
					return retVal;

			}
		}
		if (!stack.empty())
			retVal = false;

		return retVal;
	}
}
