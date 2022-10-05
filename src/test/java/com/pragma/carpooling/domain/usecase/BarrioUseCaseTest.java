package com.pragma.carpooling.domain.usecase;

import com.pragma.carpooling.domain.model.Barrio;
import com.pragma.carpooling.domain.spi.IBarrioPersistencePort;
import com.pragma.carpooling.factory.BarrioFactoryData;
import com.pragma.carpooling.infrastructure.exception.BarriosRepetidosException;
import com.pragma.carpooling.infrastructure.exception.NoHaySuficientesBarriosException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;
import java.util.List;



@ExtendWith(SpringExtension.class)
class BarrioUseCaseTest {

    @InjectMocks
    BarrioUseCase barrioUseCase;

    @Mock
    IBarrioPersistencePort barrioPersistencePort;

    @Test
    void guardarListabarrios() {
        //Given
        Barrio barrioUno = BarrioFactoryData.getBarrioUno();
        Barrio barrioDos = BarrioFactoryData.getBarrioDos();
        List<Barrio> barriosList = Arrays.asList(barrioUno,barrioDos);
        //When
        barrioUseCase.guardarListabarrios(barriosList);

        //Then
        barriosList.forEach(
                barrio -> {
                    Mockito.verify(barrioPersistencePort).guardarBarrio(barrio);
                }
        );
    }

    @Test
    void expectBarriosRepetidosException_whenHayBarriosRepetidos() {
        //Given
        Barrio barrioUno = BarrioFactoryData.getBarrioUno();
        Barrio barrioDos = BarrioFactoryData.getBarrioDos();
        Barrio barrioTres = BarrioFactoryData.getBarrioDos();
        List<Barrio> barriosList = Arrays.asList(barrioUno,barrioDos,barrioTres);

        //When
        Throwable throwable = Assertions.catchThrowable(()->barrioUseCase.guardarListabarrios(barriosList));

        //Then
        Assertions.assertThat(throwable).isExactlyInstanceOf(BarriosRepetidosException.class);
    }

    @Test
    void expectNoHaySuficientesBarriosException_whenMenosDeDosBarrios() {

        Barrio barrioUno = BarrioFactoryData.getBarrioUno();
        List<Barrio> barriosList = Arrays.asList(barrioUno);

        Throwable throwable = Assertions.catchThrowable(()->barrioUseCase.guardarListabarrios(barriosList));

        Assertions.assertThat(throwable).isExactlyInstanceOf(NoHaySuficientesBarriosException.class);
    }
}