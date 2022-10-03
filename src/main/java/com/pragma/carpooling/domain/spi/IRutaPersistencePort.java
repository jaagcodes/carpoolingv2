package com.pragma.carpooling.domain.spi;

import com.pragma.carpooling.domain.model.Ruta;
import com.pragma.carpooling.domain.model.Usuario;

import java.util.List;

public interface IRutaPersistencePort {

    Ruta guardarRuta(Ruta ruta);

    List<Ruta> obteneterTodasRutas();

    Ruta obtenerRuta(Long idRuta);

    void actualizarRuta(Ruta ruta);

    void eliminarRuta(Long idRuta);
}
