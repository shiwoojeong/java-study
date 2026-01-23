package com.uty.exam10;

public class BankAccount {
	private long balance;

	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException{
		if(balance < money) {
			throw new BalanceInsufficientException("잔액 부족");
		}
		balance -= money;
	}
}
