package com.uty.exam04;

public class Membership {
	private final int memberNo;
	private final boolean permanent = true;
	private final String name;
	
	
	//final field는 생성 시에 값을 가지고 있어야 하는데 생성자에서 가져오는거 까지는 허용
	public Membership(int memberNo, String name) {
		this.memberNo = memberNo;
		this.name = name;
	}
	
	public String getInfo() {
		return memberNo + "-" + name;
	}
	
//	//final field는 값을 바꿀 수가 없다
//	public void setMemberNo(int memberNo) {
//		this.memberNo = memberNo;
//	}
}
