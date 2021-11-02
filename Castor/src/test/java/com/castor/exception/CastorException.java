package com.castor.exception;

@SuppressWarnings("serial")
public class CastorException extends RuntimeException {
	public CastorException(String message) {
		super(message);
		System.out.println("Exception Message :" + message);
	}
}
