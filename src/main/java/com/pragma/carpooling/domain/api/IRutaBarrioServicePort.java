package com.pragma.carpooling.domain.api;

import com.pragma.carpooling.domain.model.Barrio;

import java.util.List;

public interface IRutaBarrioServicePort {

    void guardarRutaBarrio(List<Barrio> barriosList, Long idRuta);
}
