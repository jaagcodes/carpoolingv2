package com.pragma.carpooling.domain.spi;

import com.pragma.carpooling.domain.model.Ruta;
import com.pragma.carpooling.domain.model.Viaje;

import java.util.List;

public interface IViajePersistencePort {


    void guardarViajesConRuta(Long idRuta, Viaje viaje);

}
