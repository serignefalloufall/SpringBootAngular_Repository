package com.devoir.gestioncommande.model;

import java.io.Serializable;

public class ErrorResponse implements Serializable {
    private static final long serialVersionUID = -8091879091924046844L;
    private final String message;
    public ErrorResponse(String message) {
        this.message = message;
    }
    public String getMessage() {
        return this.message;
    }
}
