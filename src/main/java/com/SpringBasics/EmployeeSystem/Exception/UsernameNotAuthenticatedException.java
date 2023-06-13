package com.SpringBasics.EmployeeSystem.Exception;



//Custom Exception for Username not authenticated
public class UsernameNotAuthenticatedException extends RuntimeException{

    public UsernameNotAuthenticatedException(String message)
    {
        super(message);
    }
}
