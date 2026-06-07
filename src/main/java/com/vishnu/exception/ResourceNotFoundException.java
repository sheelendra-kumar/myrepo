package com.vishnu.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException (String massage){

        super(massage);
    }
}
