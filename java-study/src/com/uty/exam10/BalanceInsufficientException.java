package com.uty.exam10;

public class BalanceInsufficientException extends RuntimeException {
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String msg) {
		super(msg);
	}
}
