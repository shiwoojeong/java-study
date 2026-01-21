package com.uty.exam04;

public class RobotExam {
	public static void main(String[] args) {
		Robot robot01 = new Robot("robot-01", "helper");
		Robot robot02 = new Robot("robot-02", "guard");
		Robot robot03 = new Robot("robot-03", "assistance");
		
		System.out.println("Number of Robots: " + Robot.getPopulation());
	}
}
