package com.pragma.carpooling.domain.usecase;

import com.pragma.carpooling.domain.api.IBarrioServicePort;
import com.pragma.carpooling.domain.model.Barrio;
import com.pragma.carpooling.domain.spi.IBarrioPersistencePort;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class BarrioUseCase implements IBarrioServicePort {

    private final IBarrioPersistencePort barrioPersistencePort;

    @Override
    public List<Barrio> guardarListabarrios(List<Barrio> barriosList) {

        List<Barrio> barriosPersistidos = barriosList.stream().map(
                barrio->{
                  return   barrioPersistencePort.guardarBarrio(barrio);
                }
        ).collect(Collectors.toList());
        return barriosPersistidos;
    }
}
