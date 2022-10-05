package com.pragma.carpooling.domain.api;

import com.pragma.carpooling.domain.model.Viaje;

import java.util.List;

public interface IViajeServicePort {

    void guardarListaViajes(List<Viaje> viajesList, Long idRuta);
}
