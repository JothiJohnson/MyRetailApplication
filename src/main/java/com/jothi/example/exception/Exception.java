package com.jothi.example.exception;

/**
 * Handle exception
 */
public class Exception extends RuntimeException {
    /**
	 * Custom exception handling
	 */
	private static final long serialVersionUID = 1L;

	public Exception() {
        super();
    }

    public Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Exception(String message) {
        super(message);
    }

    public Exception(Throwable cause) {
        super(cause);
    }

}
