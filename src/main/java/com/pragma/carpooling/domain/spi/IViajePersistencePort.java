package com.pragma.carpooling.domain.spi;

import com.pragma.carpooling.domain.model.Ruta;
import com.pragma.carpooling.domain.model.Viaje;

import java.util.List;

public interface IViajePersistencePort {

    Viaje guardarViaje(Viaje viaje);

    void guardarViajesConRuta(Viaje viaje, Long idRuta);

    List<Viaje> obteneterTodosViajes();

    Viaje obtenerViaje(Long idViaje);

    void actualizarViaje(Viaje viaje);

    void eliminarViaje(Long idRuta);
}
