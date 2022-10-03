package com.pragma.carpooling.infrastructure.exceptionHandler;

import com.pragma.carpooling.infrastructure.exception.BarriosRepetidosException;
import com.pragma.carpooling.infrastructure.exception.CuposInvalidosException;
import com.pragma.carpooling.infrastructure.exception.NoDataFoundException;
import com.pragma.carpooling.infrastructure.exception.NoHaySuficientesBarriosException;
import com.pragma.carpooling.infrastructure.exception.UserAlreadyExistsException;
import com.pragma.carpooling.infrastructure.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Collections;
import java.util.Map;

@ControllerAdvice
public class ControllerAdvise {

    private static final String MESSAGE = "Message";

    @ExceptionHandler(UserAlreadyExistsException.class)
    public ResponseEntity<Map<String, String>> handleUserAlreadyExistsException(
            UserAlreadyExistsException userAlreadyExistsException){
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Collections.singletonMap(MESSAGE, ExceptionResponse.USER_ALREADY_EXISTS.getMessage()));
    }

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleUserNotFoundException(
            UserNotFoundException userNotFoundException){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Collections.singletonMap(MESSAGE, ExceptionResponse.USER_NOT_FOUND.getMessage()));
    }

    @ExceptionHandler(NoDataFoundException.class)
    public ResponseEntity<Map<String, String>> handleNoDataFoundException(
            NoDataFoundException noDataFoundException){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Collections.singletonMap(MESSAGE, ExceptionResponse.NO_DATA_FOUND.getMessage()));
    }

    @ExceptionHandler(BarriosRepetidosException.class)
    public ResponseEntity<Map<String, String>> handleBarriosRepetidosException(
            BarriosRepetidosException barriosRepetidosExceptionException){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Collections.singletonMap(MESSAGE, ExceptionResponse.BARRIOS_REPETIDOS.getMessage()));
    }

    @ExceptionHandler(NoHaySuficientesBarriosException.class)
    public ResponseEntity<Map<String, String>> handleNoHaySuficientesBarriosException(
            NoHaySuficientesBarriosException noHaySuficientesBarriosException){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Collections.singletonMap(MESSAGE, ExceptionResponse.INSUFICIENTES_BARRIOS.getMessage()));
    }

    @ExceptionHandler(CuposInvalidosException.class)
    public ResponseEntity<Map<String, String>> handleCuposInvalidosException(
            CuposInvalidosException CuposInvalidosException){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Collections.singletonMap(MESSAGE, ExceptionResponse.CUPOS_INVALIDOS.getMessage()));
    }

}
