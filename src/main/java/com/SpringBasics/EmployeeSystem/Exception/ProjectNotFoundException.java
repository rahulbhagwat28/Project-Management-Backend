package com.SpringBasics.EmployeeSystem.Exception;


//Custom Exception for project not found
public class ProjectNotFoundException extends RuntimeException{

    public ProjectNotFoundException(String message)
    {
        super(message);
    }

}