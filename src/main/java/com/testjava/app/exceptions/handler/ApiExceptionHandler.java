package com.testjava.app.exceptions.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = NotFoundDataException.class)
    public ResponseEntity<CustomException> notDataFoundException(NotFoundDataException ex){
        CustomException exception = CustomException.builder().code(ex.getCode()).message(ex.getMessage()).build();
        return new ResponseEntity<>(exception, HttpStatus.NO_CONTENT);
    }

    @ExceptionHandler(value = NotFoundException.class)
    public ResponseEntity<CustomException> badRequestException(NotFoundException ex){
        CustomException exception = CustomException.builder().code(ex.getCode()).message(ex.getMessage()).build();
        return new ResponseEntity<>(exception, HttpStatus.BAD_REQUEST);
    }
}
