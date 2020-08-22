package ru.itmo.exceptions;

public class CatalogLoadException extends Exception {

    public CatalogLoadException() {
    }

    public CatalogLoadException(String message) {
        super(message);
    }

    public CatalogLoadException(String message, Throwable cause) {
        super(message, cause);
    }

    public CatalogLoadException(Throwable cause) {
        super(cause);
    }

    public CatalogLoadException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
