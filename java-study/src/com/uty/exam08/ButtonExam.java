package com.uty.exam08;

public class ButtonExam {
	public static void main(String[] args) {
		Button btn = new Button();

		btn.setOnClickListner(new CallListener());
		btn.touch();
	}
}
