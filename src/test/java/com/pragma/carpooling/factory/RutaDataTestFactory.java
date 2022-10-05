package com.pragma.carpooling.factory;

import com.pragma.carpooling.domain.model.Ruta;

public class RutaDataTestFactory {

    public static Ruta getRuta(){
        Ruta ruta = new Ruta();
        ruta.setIdRuta(1L);
        ruta.setIdUsuario(1L);
        ruta.setCupos(1);
        ruta.setDescripcion("Norte-Sur");
        return ruta;
    }
}
