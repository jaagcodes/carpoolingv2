package com.pragma.carpooling.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioRequest {

    private String email;
    private String nombres;
    private String apellidos;
}
