package com.testjava.app.exceptions.handler;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Builder
@Data
public class CustomException {
    private String code;
    private String message;

    public CustomException(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
