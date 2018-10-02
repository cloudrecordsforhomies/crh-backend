package com.example.demo;

public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(Long id) {
		super(String.valueOf(id));
	}
}
