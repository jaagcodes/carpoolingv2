package com.pragma.carpooling.domain.usecase;

import com.pragma.carpooling.domain.model.Ruta;
import com.pragma.carpooling.domain.spi.IRutaPersistencePort;
import com.pragma.carpooling.factory.RutaDataTestFactory;
import com.pragma.carpooling.infrastructure.exception.CuposInvalidosException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.verify;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

@ExtendWith(SpringExtension.class)
class RutaUseCaseTest {

    @InjectMocks
    RutaUseCase rutaUseCase;

    @Mock
    IRutaPersistencePort rutaPersistencePort;

    @Test
    void expectCuposInvalidosException_whenCuposInvalidos() {

        //Given
        Ruta ruta = RutaDataTestFactory.getRuta();
        ruta.setCupos(0);

        //When
        Throwable throwable = catchThrowable(() -> rutaUseCase.guardarRuta(ruta));

        //Then
        assertThat(throwable).isExactlyInstanceOf(CuposInvalidosException.class);
    }

    @Test
    void mustGuardarRuta_whenGuardarRuta(){

        //Given
        Ruta ruta = RutaDataTestFactory.getRuta();

        //When
        rutaUseCase.guardarRuta(ruta);

        //Then
        verify(rutaPersistencePort).guardarRuta(ruta);
    }
}