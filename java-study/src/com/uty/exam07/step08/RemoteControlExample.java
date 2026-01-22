package com.uty.exam07.step08;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		RemoteControl rc2 = new Audio();
		rc2.turnOn();
		
	}
}
