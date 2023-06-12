package com.SpringBasics.EmployeeSystem.Exception;

public class ProjectNotFoundException extends RuntimeException{

    public ProjectNotFoundException(String message)
    {
        super(message);
    }

}