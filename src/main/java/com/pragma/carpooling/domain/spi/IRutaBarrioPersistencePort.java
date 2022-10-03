package com.pragma.carpooling.domain.spi;

import com.pragma.carpooling.domain.model.RutaBarrio;

import java.util.List;

public interface IRutaBarrioPersistencePort {

    RutaBarrio guardarRutaBarrio(RutaBarrio rutaBarrio);

    List<RutaBarrio> listarRutaBarrio();
}
