package com.SpringBasics.EmployeeSystem.Exception;


//Custom Exception for User Not found
public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(String message)
    {
        super(message);
    }

}
