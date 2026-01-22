package com.uty.exam07.step11;

public class RemoteControlExample {
	public static void main(String[] args) {
		System.out.println("리모콘 최대 볼륨: " + RemoteControl.MAX_VOLUME);
		System.out.println("리모콘 최저 볼륨: " + RemoteControl.MIN_VOLUME);
		
		RemoteControl rc = new Television();
		RemoteControl rc2 = new Audio();

		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc2.turnOn();
		rc2.setVolume(5);
		rc2.turnOff();
		
		rc.setMute(true);
		rc.setMute(false);
		
		rc2.setMute(true);
		rc2.setMute(false);
		
		RemoteControl.changeBattery();
	}
}
