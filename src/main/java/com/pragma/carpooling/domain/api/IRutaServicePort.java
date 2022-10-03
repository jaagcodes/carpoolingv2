package com.pragma.carpooling.domain.api;


import com.pragma.carpooling.domain.model.Barrio;
import com.pragma.carpooling.domain.model.Ruta;
import com.pragma.carpooling.domain.model.Usuario;
import com.pragma.carpooling.domain.model.Viaje;

import java.util.List;

public interface IRutaServicePort {

    Ruta guardarRuta(Ruta ruta);

}
