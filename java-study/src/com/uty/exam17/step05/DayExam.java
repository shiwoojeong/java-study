package com.uty.exam17.step05;

public class DayExam {
	public static void main(String[] args) {
//		if (Day.MONDAY == Month.AUGUST) {
//			System.out.println("It's same!!");
//		}
		
		Day day = Day.THURSDAY;
		
		switch(day) {
		case MONDAY:
			System.out.println("It's Monday");
			break;
		case TUESDAY:
			System.out.println("It's Tuesday");
			break;
		case WEDNESDAY:
			System.out.println("It's Wednesday");
			break;
		case THURSDAY:
			System.out.println("It's Thursday");
			break;
		case FRIDAY:
			System.out.println("It's Friday");
			break;
		case SATURDAY:
			System.out.println("It's Saturday");
			break;
		case SUNDAY:
			System.out.println("It's Sunday");
			break;
		
		}
	}

}
