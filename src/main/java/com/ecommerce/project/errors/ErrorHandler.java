package com.ecommerce.project.errors;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler
    public ResponseEntity<ErrorMessage>  customerErrorHandler(CustomerErrors customerErrors){
        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setMessage(customerErrors.getMessage());
        errorMessage.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        errorMessage.setTimeStamp(System.currentTimeMillis());
        return  new ResponseEntity<>(errorMessage, HttpStatusCode.valueOf(errorMessage.getStatus()));
    }

}
