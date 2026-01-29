package com.uty.exam17.step03;

public class DayExam {
	public static void main(String[] args) {
		
		
		//dead code
		if (Day.MONDAY == Month.AUGUST) {
			System.out.println("It's same!!");
		}

		int day = Day.THURSDAY;

		switch (day) {
		case Day.MONDAY:
			System.out.println("It's Monday");
			break;
		case Day.TUESDAY:
			System.out.println("It's Tuesday");
			break;
		case Day.WEDNESDAY:
			System.out.println("It's Wednesday");
			break;
		case Day.THURSDAY:
			System.out.println("It's Thursday");
			break;
		case Day.FRIDAY:
			System.out.println("It's Friday");
			break;
		case Day.SATURDAY:
			System.out.println("It's Saturday");
			break;
		case Day.SUNDAY:
			System.out.println("It's Sunday");
			break;

		}
	}
}
