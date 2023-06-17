package com.seddik_commons.restExceptionHndler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class RestExceptionHandler {
    // @ResponseStatus(HttpStatus.EXPECTATION_FAILED)
    @ExceptionHandler(Exception.class)
    Map<String,String> exceptionHandler(Exception exception){
        Map<String,String> map = new HashMap<>();
        map.put("error",exception.getMessage());
        return map;
    }
}
