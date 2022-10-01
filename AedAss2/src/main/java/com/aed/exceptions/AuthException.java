package com.aed.exceptions;

/**
 *
 * @author yashpawar
 */
public class AuthException extends Exception {
    private static final long serialVersionUID = 1L;
	public AuthException(String message, Throwable cause) {
		super(message, cause);
	}
	public AuthException(String message) {
		super(message);
	}
	public AuthException(Throwable cause) {
		super(cause);
	}
}
