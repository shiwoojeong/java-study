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