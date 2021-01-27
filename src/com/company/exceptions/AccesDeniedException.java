package com.company.exceptions;

public class AccesDeniedException extends RuntimeException {
    public AccesDeniedException() {
    }

    public AccesDeniedException(String message) {
        super(message);
    }

    public AccesDeniedException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccesDeniedException(Throwable cause) {
        super(cause);
    }

    public AccesDeniedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
