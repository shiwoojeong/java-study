package com.uty.exam14.step04;

public class Member {
	private String name;
	private String gender;
	private int point;
	
	public Member(String name, String gender, int point) {
		super();
		this.name = name;
		this.gender = gender;
		this.point = point;
	}

	public String getGender() {
		return gender;
	}

	public int getPoint() {
		return point;
	}
	
	

}
