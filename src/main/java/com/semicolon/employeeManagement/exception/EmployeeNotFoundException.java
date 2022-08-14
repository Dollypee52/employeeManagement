package com.semicolon.employeeManagement.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class  EmployeeNotFoundException extends RuntimeException {
    //internally implement serializable interface
    private static final long serialVersionUID = 1L;

    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
