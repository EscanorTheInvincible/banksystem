package com.bankofireland.banksystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BankSystemExceptionHandler {

    @ExceptionHandler(value={CustomerNotFoundException.class})
    public ResponseEntity<Object> handleCustomerNorFound(CustomerNotFoundException customerNotFoundException){

        BankSystemException bankSystemException = new BankSystemException(
            customerNotFoundException.getMessage(),
            customerNotFoundException.getCause(),
            HttpStatus.NOT_FOUND
        );

        return new ResponseEntity<>(bankSystemException, HttpStatus.NOT_FOUND);
    }
}
