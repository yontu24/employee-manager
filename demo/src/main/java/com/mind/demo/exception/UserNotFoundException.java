package com.mind.demo.exception;

public class UserNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -5328679477305648694L;

	public UserNotFoundException(String message) {
		super(message);
	}
}
