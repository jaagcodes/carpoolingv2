package com.pragma.carpooling.domain.api;

import com.pragma.carpooling.domain.model.Barrio;

import java.util.List;

public interface IBarrioServicePort {

    List<Barrio> guardarListabarrios(List<Barrio> barriosList);
}
