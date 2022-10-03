package com.pragma.carpooling.infrastructure.exceptionHandler;

public enum ExceptionResponse {

    USER_NOT_FOUND("No user found with this email"),
    NO_DATA_FOUND("No data found for this request"),
    USER_ALREADY_EXISTS("There is already a user with this email");

    private String message;

    ExceptionResponse(String message){
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }
}
