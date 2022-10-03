package com.pragma.carpooling.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioResponse {

    private Long idUsuario;
    private String email;
    private String nombres;
    private String apellidos;
}
