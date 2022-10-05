package com.pragma.carpooling.domain.usecase;

import com.pragma.carpooling.domain.model.Viaje;
import com.pragma.carpooling.domain.spi.IViajePersistencePort;
import com.pragma.carpooling.factory.ViajeDataFactory;
import com.pragma.carpooling.infrastructure.exception.HorarioNullException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

@ExtendWith(SpringExtension.class)
class ViajeUseCaseTest {

    @InjectMocks
    ViajeUseCase viajeUseCase;

    @Mock
    IViajePersistencePort viajePersistencePort;

    @Test
    void expectHorarioNullException_whenHorarioNull(){

        //Given
        Long idRuta = 1l;
        Viaje viajeUno = ViajeDataFactory.getViajeUno();
        viajeUno.setHorario(null);
        Viaje viajeDos = ViajeDataFactory.getViajeDos();
        List<Viaje> viajesList = Arrays.asList(viajeUno,viajeDos);

        //When
        Throwable throwable = catchThrowable(()-> viajeUseCase.guardarListaViajes(viajesList,idRuta));

        //Then
        assertThat(throwable).isExactlyInstanceOf(HorarioNullException.class);
    }

    @Test
    void guardarListaViajes() {

        //Given
        Long idRuta = 1l;
        Viaje viajeUno = ViajeDataFactory.getViajeUno();
        Viaje viajeDos = ViajeDataFactory.getViajeDos();
        List<Viaje> viajesList = Arrays.asList(viajeUno,viajeDos);

        //When
        viajeUseCase.guardarListaViajes(viajesList,idRuta);

        //Then
        viajesList.forEach(
                viaje -> {
                    Mockito.verify(viajePersistencePort).guardarViajesConRuta(idRuta,viaje);
                }
        );


    }
}