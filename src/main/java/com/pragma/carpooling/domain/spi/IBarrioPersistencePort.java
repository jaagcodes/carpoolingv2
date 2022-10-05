package com.pragma.carpooling.domain.spi;

import com.pragma.carpooling.domain.model.Barrio;


public interface IBarrioPersistencePort {

    Barrio guardarBarrio(Barrio barrio);

}
