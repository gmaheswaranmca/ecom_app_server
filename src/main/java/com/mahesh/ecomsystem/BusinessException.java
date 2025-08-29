package com.mahesh.ecomsystem;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BusinessException extends RuntimeException {
    public BusinessException(String msg) { super(msg); }
}