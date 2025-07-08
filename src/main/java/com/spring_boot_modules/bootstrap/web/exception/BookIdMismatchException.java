package com.spring_boot_modules.bootstrap.web.exception;

public class BookIdMismatchException extends RuntimeException {

    private static final long serialVersionUID = -1911752782084665193L;

	public BookIdMismatchException() {
        super();
    }

    public BookIdMismatchException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public BookIdMismatchException(final String message) {
        super(message);
    }

    public BookIdMismatchException(final Throwable cause) {
        super(cause);
    }
}