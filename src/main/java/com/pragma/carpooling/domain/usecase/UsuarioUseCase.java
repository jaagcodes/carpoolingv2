package com.pragma.carpooling.domain.usecase;

import com.pragma.carpooling.domain.api.IUsuarioServicePort;
import com.pragma.carpooling.domain.model.Usuario;
import com.pragma.carpooling.domain.spi.IUsuarioPersistencePort;


public class UsuarioUseCase implements IUsuarioServicePort {

    private final IUsuarioPersistencePort usuarioPersistencePort;

    public UsuarioUseCase(IUsuarioPersistencePort usuarioPersistencePort) {
        this.usuarioPersistencePort = usuarioPersistencePort;
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioPersistencePort.guardarUsuario(usuario);
    }

}

