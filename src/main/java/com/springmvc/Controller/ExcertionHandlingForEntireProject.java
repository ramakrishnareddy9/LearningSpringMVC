package com.springmvc.Controller;

import com.springmvc.UserException.IdNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import java.io.IOException;

// this works for all the controllers in the project
@ControllerAdvice
public class ExcertionHandlingForEntireProject {
    // single exception handler for all the exceptions
    @ExceptionHandler(value = NullPointerException.class)
    public String exception0() {
        return "exception";
    }
    // multiple exception handler for multiple exceptions
    @ExceptionHandler({ArithmeticException.class, IOException.class})
    public String exception1() {
        return "exception";
    }
    // user defined exception handler for specific exception
    @ExceptionHandler(IdNotFoundException.class)
    public String exception2() {
        return "exception";
    }

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR) // this will send the response code 500 used while creating REST API
    @ExceptionHandler(value = Exception.class)
    public String exception() {
        return "exception";
    }
}
