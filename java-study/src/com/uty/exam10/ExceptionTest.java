package com.uty.exam10;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("java.lang.String2");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
}
