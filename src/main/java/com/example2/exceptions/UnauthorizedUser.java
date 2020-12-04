package com.example2.exceptions;

public class UnauthorizedUser extends RuntimeException{
    public UnauthorizedUser(String message) {
        super(message);
    }
}
