package com.pragma.carpooling.domain.usecase;

import com.pragma.carpooling.domain.api.IBarrioServicePort;
import com.pragma.carpooling.domain.model.Barrio;
import com.pragma.carpooling.domain.spi.IBarrioPersistencePort;
import com.pragma.carpooling.infrastructure.exception.BarriosRepetidosException;
import com.pragma.carpooling.infrastructure.exception.NoHaySuficientesBarriosException;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class BarrioUseCase implements IBarrioServicePort {

    private final IBarrioPersistencePort barrioPersistencePort;

    @Override
    public List<Barrio> guardarListabarrios(List<Barrio> barriosList) {

        if(!verificarNoHayBarriosRepetidos(barriosList)){
            throw new BarriosRepetidosException();
        }

        if(!verificarHayMinimoDosBarrios(barriosList)){
            throw new NoHaySuficientesBarriosException();
        }

        List<Barrio> barriosPersistidos = barriosList.stream().map(
                barrio->{
                  return   barrioPersistencePort.guardarBarrio(barrio);
                }
        ).collect(Collectors.toList());
        return barriosPersistidos;
    }

    public boolean verificarNoHayBarriosRepetidos(List<Barrio> barriosList){
        Set<Barrio> barriosSet = new HashSet<>(barriosList);
        System.out.println("barriosList.size(): "+barriosList.size());
        System.out.println("barriosSet.size(): "+barriosSet.size());
        if(barriosList.size()!=barriosSet.size()){
            return false;
        }
        return true;
    }

    public  boolean verificarHayMinimoDosBarrios(List<Barrio> barriosList){
        Set<Barrio> barriosSet = new HashSet<>(barriosList);
        if(barriosSet.size()>=2){
            return true;
        }
        return false;
    }
}
