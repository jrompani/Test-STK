package com.testjava.app.exceptions.handler;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BadRequestException extends Exception {
    private String code = "P-400";
    private String message = "Verifique los datos ingresados.";

    public BadRequestException(String code, String message) {
        this.code = code;
        this.message = message;
    }
    public BadRequestException() {
    }

    public BadRequestException(String message) {
        super(message);
    }
}
