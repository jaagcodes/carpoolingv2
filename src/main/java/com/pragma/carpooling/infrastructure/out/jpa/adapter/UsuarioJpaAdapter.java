package com.pragma.carpooling.infrastructure.out.jpa.adapter;

import com.pragma.carpooling.domain.model.Usuario;
import com.pragma.carpooling.domain.spi.IUsuarioPersistencePort;
import com.pragma.carpooling.infrastructure.exception.NoDataFoundException;
import com.pragma.carpooling.infrastructure.exception.UserNotFoundException;
import com.pragma.carpooling.infrastructure.exception.UserAlreadyExistsException;
import com.pragma.carpooling.infrastructure.out.jpa.entity.UsuarioEntity;
import com.pragma.carpooling.infrastructure.out.jpa.mapper.UsuarioEntityMapper;
import com.pragma.carpooling.infrastructure.out.jpa.repository.IUsuarioRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class UsuarioJpaAdapter implements IUsuarioPersistencePort {

    private final IUsuarioRepository usuarioRepository;
    private final UsuarioEntityMapper usuarioEntityMapper;

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        if(usuarioRepository.findByEmail(usuario.getEmail()).isPresent()){
            throw new UserAlreadyExistsException();
        }
        return usuarioEntityMapper.toUsuario(usuarioRepository.save(usuarioEntityMapper.toEntity(usuario)));
    }


    @Override
    public Usuario obtenerUsuario(String emailUsuario) {
        return usuarioEntityMapper.toUsuario(usuarioRepository.findByEmail(emailUsuario)
                .orElseThrow(UserNotFoundException::new));
    }

}
