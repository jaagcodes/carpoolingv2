package com.pragma.carpooling.domain.spi;


import com.pragma.carpooling.domain.model.Viaje;



public interface IViajePersistencePort {


    void guardarViajesConRuta(Long idRuta, Viaje viaje);

}
