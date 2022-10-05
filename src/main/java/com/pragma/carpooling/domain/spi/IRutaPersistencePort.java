package com.pragma.carpooling.domain.spi;

import com.pragma.carpooling.domain.model.Ruta;


public interface IRutaPersistencePort {

    Ruta guardarRuta(Ruta ruta);

}
