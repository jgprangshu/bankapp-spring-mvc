package com.capgemini.spring.mvc.exception;

public class LowBalanceException extends Exception {
	
	public LowBalanceException() {
		super();

	}

	public LowBalanceException(String message) {
		super(message);

	}
}
