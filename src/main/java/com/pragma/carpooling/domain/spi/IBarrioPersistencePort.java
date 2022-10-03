package com.pragma.carpooling.domain.spi;

import com.pragma.carpooling.domain.model.Barrio;
import com.pragma.carpooling.domain.model.Usuario;

import java.util.List;

public interface IBarrioPersistencePort {

    Barrio guardarBarrio(Barrio barrio);

    List<Barrio> obteneterTodosBarrios();

    Barrio obtenerBarrio(Long idBarrio);

    void actualizarBarrio(Barrio usuario);

    void eliminarBarrio(Long idBarrio);
}
