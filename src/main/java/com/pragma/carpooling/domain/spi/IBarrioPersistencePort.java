package com.pragma.carpooling.domain.spi;

import com.pragma.carpooling.domain.model.Barrio;
import com.pragma.carpooling.domain.model.Usuario;

import java.util.List;

public interface IBarrioPersistencePort {

    Barrio guardarBarrio(Barrio barrio);

}
