package com.jothi.example.exception;

/**
 * for HTTP 404 errors
 */
public final class HttpClientErrorException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HttpClientErrorException() {
        super();
    }

    public HttpClientErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public HttpClientErrorException(String message) {
        super(message);
    }

    public HttpClientErrorException(Throwable cause) {
        super(cause);
    }
}