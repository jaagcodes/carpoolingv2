package com.pragma.carpooling.domain.usecase;

import com.pragma.carpooling.domain.api.IViajeServicePort;
import com.pragma.carpooling.domain.model.Viaje;
import com.pragma.carpooling.domain.spi.IViajePersistencePort;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ViajeUseCase implements IViajeServicePort {

    private final IViajePersistencePort viajePersistencePort;

    @Override
    public void guardarListaViajes(List<Viaje> viajesList, Long idRuta) {

        viajesList.stream().forEach(
                viaje -> {
                     viajePersistencePort.guardarViajesConRuta(idRuta , viaje);
                }
        );

    }
}
