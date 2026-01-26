package com.uty.exam12.step05;

public class Guest02 extends Thread{
	private VendingMachine machine;

	public void setMachine(VendingMachine machine) {
		this.machine = machine;
		this.setName("Guest01");
	}

	@Override
	public void run() {
		machine.setOrder("펩시제로");
	}

}
