package com.vishnu.exception;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException (String massage){

        super(massage);
    }
}
