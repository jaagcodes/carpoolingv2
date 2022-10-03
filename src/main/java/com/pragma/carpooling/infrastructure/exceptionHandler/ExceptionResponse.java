package com.pragma.carpooling.infrastructure.exceptionHandler;

public enum ExceptionResponse {

    USER_NOT_FOUND("No existe usuario con este email"),
    NO_DATA_FOUND("No se encontraron datos"),
    USER_ALREADY_EXISTS("Ya existe un usaurio con este email"),
    BARRIOS_REPETIDOS("No pueden haber barrios con el mismo nombre repetidos en una ruta"),
    INSUFICIENTES_BARRIOS("No hay suficientes barrios para registrar una ruta"),
    CUPOS_INVALIDOS("Cantidad de cupos inválidos, debe estar entre 4 y 1 (incluyéndolos)");

    private String message;

    ExceptionResponse(String message){
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }
}
