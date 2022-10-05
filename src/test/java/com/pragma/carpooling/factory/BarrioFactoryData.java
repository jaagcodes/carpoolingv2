package com.pragma.carpooling.factory;

import com.pragma.carpooling.domain.model.Barrio;

public class BarrioFactoryData {

    public static Barrio getBarrioUno(){
        Barrio barrio = new Barrio();
        barrio.setIdBarrio(1L);
        barrio.setNombre("San Jose");
        barrio.setDescripcion("Sabaneta");
        return barrio;
    }

    public static Barrio getBarrioDos(){
        Barrio barrio = new Barrio();
        barrio.setIdBarrio(1L);
        barrio.setNombre("La Doctora");
        barrio.setDescripcion("Sabaneta");
        return barrio;
    }
}
