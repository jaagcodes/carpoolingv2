package com.pragma.carpooling.domain.usecase;

import com.pragma.carpooling.domain.api.IRutaServicePort;
import com.pragma.carpooling.domain.model.Ruta;
import com.pragma.carpooling.domain.spi.IRutaPersistencePort;

import com.pragma.carpooling.infrastructure.exception.CuposInvalidosException;
import lombok.RequiredArgsConstructor;



@RequiredArgsConstructor
public class RutaUseCase implements IRutaServicePort {

    private final IRutaPersistencePort rutaPersistencePort;

    @Override
    public Ruta guardarRuta(Ruta ruta) {
        if(!validacionCantidadDeCupos(ruta.getCupos())){
            throw new CuposInvalidosException();
        }
        return rutaPersistencePort.guardarRuta(ruta);
    }

    private boolean validacionCantidadDeCupos(Integer cupos ){
        if(cupos > 4 || cupos < 1){
            return false;
        }
        return true;
    }

}
