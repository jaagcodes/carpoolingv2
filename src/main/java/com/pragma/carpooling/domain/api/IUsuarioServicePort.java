package com.pragma.carpooling.domain.api;

import com.pragma.carpooling.domain.model.Usuario;

import java.util.List;

public interface IUsuarioServicePort {

    void guardarUsuario(Usuario usuario);

    List<Usuario> obteneterTodosUsuarios();

    Usuario obtenerUsuario(String emailUsuario);

    void actualizarUsuario(Usuario usuario);

    void eliminarUsuario(String emailUsuario);
}
