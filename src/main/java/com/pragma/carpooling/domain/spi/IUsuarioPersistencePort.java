package com.pragma.carpooling.domain.spi;

import com.pragma.carpooling.domain.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioPersistencePort {

    Usuario guardarUsuario(Usuario usuario);

    List<Usuario> obteneterTodosUsuarios();

    Usuario obtenerUsuario(String emailUsuario);

    void actualizarUsuario(Usuario usuario);

    void eliminarUsuario(String emailUsuario);

}
