package com.uty.exam04;

public class RobotExam {
	public static void main(String[] args) {
		Robot robot01 = new Robot("robot-01", "helper");
		Robot robot02 = new Robot("robot-02", "guard");
		Robot robot03 = new Robot("robot-03", "assistance");
		
		System.out.println("Number of Robots: " + Robot.getPopulation());
		
	}
}

//Java applicaton 기동 순서
//Class Loader 기동 -> main 쓰레드 기동
//main 매서드는 무조건 public static이어야한다.
//public이 아니면 main쓰레드가 접근하지 못한다
//static이 아니면 객체를 만들어야 접근 가능하다