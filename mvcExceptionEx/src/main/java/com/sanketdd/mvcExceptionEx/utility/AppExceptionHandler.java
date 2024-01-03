package com.sanketdd.mvcExceptionEx.utility;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public String handleException(Exception e){
        System.out.println("Exception occurred "+ e.getMessage());
        return "error-view";
    }
}
