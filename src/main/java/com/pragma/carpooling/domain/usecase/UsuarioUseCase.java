package com.pragma.carpooling.domain.usecase;

import com.pragma.carpooling.domain.api.IUsuarioServicePort;
import com.pragma.carpooling.domain.model.Usuario;
import com.pragma.carpooling.domain.spi.IUsuarioPersistencePort;

import java.util.List;

public class UsuarioUseCase implements IUsuarioServicePort {

    private final IUsuarioPersistencePort usuarioPersistencePort;

    public UsuarioUseCase(IUsuarioPersistencePort usuarioPersistencePort) {
        this.usuarioPersistencePort = usuarioPersistencePort;
    }

    @Override
    public void guardarUsuario(Usuario usuario) {
        usuarioPersistencePort.guardarUsuario(usuario);
    }

    @Override
    public List<Usuario> obteneterTodosUsuarios() {

        return usuarioPersistencePort.obteneterTodosUsuarios();
    }

    @Override
    public Usuario obtenerUsuario(String emailUsuario) {

        return usuarioPersistencePort.obtenerUsuario(emailUsuario);
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
        usuarioPersistencePort.actualizarUsuario(usuario);
    }

    @Override
    public void eliminarUsuario(String emailUsuario) {
        usuarioPersistencePort.eliminarUsuario(emailUsuario);
    }
}
