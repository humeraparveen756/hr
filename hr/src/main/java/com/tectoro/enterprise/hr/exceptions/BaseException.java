package com.tectoro.enterprise.hr.exceptions;

/**
 * This serves as Base runtime exception
 */
public class BaseException extends RuntimeException {
	
	public BaseException(Exception ex) {
		super(ex);
	}
}
