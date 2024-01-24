package br.com.Parte.exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdviceExcepitons {
    @ExceptionHandler(value = {Exception.class})
    public String handler(Exception ex){
        return ex.getMessage();
    }
}

