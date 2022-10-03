package com.pragma.carpooling.domain.spi;

import com.pragma.carpooling.domain.model.Ruta;
import com.pragma.carpooling.domain.model.Usuario;

import java.util.List;

public interface IRutaPersistencePort {

    Ruta guardarRuta(Ruta ruta);

}
