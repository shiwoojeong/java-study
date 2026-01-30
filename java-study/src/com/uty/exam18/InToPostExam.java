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
		System.out.println();
		System.out.println(infixToPostfix(ex2));
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



		for (int i = 0; i < expression.length(); i++) {
		    char ch = expression.charAt(i);
		    //공백일 경우 무시
		    if(ch == ' ')continue;
		    
		    if (ch == '(') {
		        stack.push(ch);
		    } 
		    else if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {
		        // 연산자 우선순위가 높거나 같은 연산자를 만나면 pop연산자 수행
		        while (!stack.empty() && priority.get(stack.peek()) >= priority.get(ch)) {
		            Postfix.append(stack.pop());
		        }
		        stack.push(ch); // 그다음 나를 push
		    } 
		    else if (ch == ')') {
		        while (!stack.empty() && stack.peek() != '(') {
		            Postfix.append(stack.pop());
		        }
		        if (!stack.empty()) stack.pop(); //  '('를 스택에서 제거 
		    } 
		    else { // 숫자인 경우
		        Postfix.append(ch);
		    }
		}

		//스택이 빌 때까지 돌아갑니다.
		while (!stack.empty()) {
		    Postfix.append(stack.pop());
		}

		return Postfix.toString();
	}
}