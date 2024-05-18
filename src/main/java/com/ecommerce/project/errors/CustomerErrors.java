package com.ecommerce.project.errors;

public class CustomerErrors extends RuntimeException{
    public CustomerErrors(String message) {
        super(message);
    }
}
