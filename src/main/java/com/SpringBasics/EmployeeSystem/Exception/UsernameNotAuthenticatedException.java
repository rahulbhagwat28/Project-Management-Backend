package com.SpringBasics.EmployeeSystem.Exception;

public class UsernameNotAuthenticatedException extends RuntimeException{

    public UsernameNotAuthenticatedException(String message)
    {
        super(message);
    }
}
