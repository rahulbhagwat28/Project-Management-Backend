package com.SpringBasics.EmployeeSystem.Exception;


//Custom Exception for project already completed
public class ProjectCompletedException  extends RuntimeException{

    public ProjectCompletedException(String message)
    {
        super(message);
    }
}
