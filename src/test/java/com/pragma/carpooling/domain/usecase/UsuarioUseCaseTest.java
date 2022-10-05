package com.pragma.carpooling.domain.usecase;

import com.pragma.carpooling.domain.model.Usuario;
import com.pragma.carpooling.domain.spi.IUsuarioPersistencePort;
import com.pragma.carpooling.factory.UsuarioDataTestFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(SpringExtension.class)
class UsuarioUseCaseTest {

    @InjectMocks
    UsuarioUseCase usuarioUseCase;

    @Mock
    IUsuarioPersistencePort usuarioPersistencePort;

    @Test
    void guardarUsuario() {
        //Given
        Usuario usuario = UsuarioDataTestFactory.getUsuario();

        //When
        usuarioUseCase.guardarUsuario(usuario);

        //Then
        verify(usuarioPersistencePort).guardarUsuario(usuario);
    }


}