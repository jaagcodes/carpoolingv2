package com.pragma.carpooling.factory;

import com.pragma.carpooling.domain.model.Viaje;

import java.time.LocalDateTime;

public class ViajeDataFactory {

    public static Viaje getViajeUno(){
        Viaje viaje = new Viaje();
        viaje.setIdViaje(1L);
        viaje.setIdRuta(1L);
        viaje.setHorario(LocalDateTime.now());
        return viaje;
    }

    public static Viaje getViajeDos(){
        Viaje viaje = new Viaje();
        viaje.setIdViaje(1L);
        viaje.setIdRuta(1L);
        viaje.setHorario(LocalDateTime.now().plusDays(1));
        return viaje;
    }
}
