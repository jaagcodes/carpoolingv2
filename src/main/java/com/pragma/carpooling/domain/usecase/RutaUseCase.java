package com.pragma.carpooling.domain.usecase;

import com.pragma.carpooling.domain.api.IRutaServicePort;
import com.pragma.carpooling.domain.model.Ruta;
import com.pragma.carpooling.domain.spi.IRutaPersistencePort;

import lombok.RequiredArgsConstructor;



@RequiredArgsConstructor
public class RutaUseCase implements IRutaServicePort {

    private final IRutaPersistencePort rutaPersistencePort;

    @Override
    public Ruta guardarRuta(Ruta ruta) {
        return rutaPersistencePort.guardarRuta(ruta);
    }

}
