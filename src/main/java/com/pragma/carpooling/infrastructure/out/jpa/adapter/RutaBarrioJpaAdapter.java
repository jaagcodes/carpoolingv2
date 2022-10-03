package com.pragma.carpooling.infrastructure.out.jpa.adapter;

import com.pragma.carpooling.domain.model.RutaBarrio;
import com.pragma.carpooling.domain.spi.IRutaBarrioPersistencePort;
import com.pragma.carpooling.infrastructure.exception.NoDataFoundException;
import com.pragma.carpooling.infrastructure.out.jpa.entity.RutaBarrioEntity;
import com.pragma.carpooling.infrastructure.out.jpa.mapper.RutaBarrioEntityMapper;
import com.pragma.carpooling.infrastructure.out.jpa.repository.IRutaBarrioRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class RutaBarrioJpaAdapter implements IRutaBarrioPersistencePort {

    private final IRutaBarrioRepository rutaBarrioRepository;
    private final RutaBarrioEntityMapper rutaBarrioEntityMapper;

    @Override
    public void guardarRutaBarrio(RutaBarrio rutaBarrio) {
        RutaBarrioEntity rutaBarrioEntity = rutaBarrioEntityMapper.toRutaBarrioEntity(rutaBarrio);
        rutaBarrioRepository.save(rutaBarrioEntity);
    }

}
