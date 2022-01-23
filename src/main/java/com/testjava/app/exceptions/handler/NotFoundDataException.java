package com.testjava.app.exceptions.handler;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@Builder
public class NotFoundDataException extends Exception{

    private String code = "P-204";
    private String message = "No hay data para mostrar en la BD.";

    public NotFoundDataException(String code, String message) {
        this.code = code;
        this.message = message;
    }
    public NotFoundDataException() {
    }

    public NotFoundDataException(String message) {
        super(message);
    }
}
