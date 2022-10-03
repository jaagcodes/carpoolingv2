package com.pragma.carpooling.application.handler;

import com.pragma.carpooling.application.dto.RutaCompletaRequest;

import java.util.List;

public interface IRutaHandler {

    void guardarRutaCompleta(RutaCompletaRequest rutaCompletaRequest);

    //List<UsuarioResponse> obtenerTodosLosUsuarios();

    //UsuarioResponse obtenerUsuario(String emailUsuario);

    //void actualizarUsuario(UsuarioRequest usuarioRequest);

    //void eliminarUsuario(String emailUsuario);
}
