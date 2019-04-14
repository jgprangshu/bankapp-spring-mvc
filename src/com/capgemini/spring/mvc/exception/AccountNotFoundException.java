package com.capgemini.spring.mvc.exception;

public class AccountNotFoundException extends Exception {
	
	public AccountNotFoundException() {
		super();

	}

	public AccountNotFoundException(String message) {
		super(message);

}
}
