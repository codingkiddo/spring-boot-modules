package com.spring_boot_modules.bootstrap.web.exception;

public class BookNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -2205609218925711366L;

	public BookNotFoundException() {
        super();
    }

    public BookNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public BookNotFoundException(final String message) {
        super(message);
    }

    public BookNotFoundException(final Throwable cause) {
        super(cause);
    }
}