package com.pragma.carpooling.application.handler;

import com.pragma.carpooling.application.dto.UsuarioRequest;
import com.pragma.carpooling.application.dto.UsuarioResponse;

import java.util.List;

public interface IUsuarioHandler {

    void guardarUsuario(UsuarioRequest usuarioRequest);

    List<UsuarioResponse> obtenerTodosLosUsuarios();

    UsuarioResponse obtenerUsuario(String emailUsuario);

    void actualizarUsuario(UsuarioRequest usuarioRequest);

    void eliminarUsuario(String emailUsuario);
}
