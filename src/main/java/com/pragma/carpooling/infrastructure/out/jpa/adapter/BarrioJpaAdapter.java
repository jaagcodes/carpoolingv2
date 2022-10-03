package com.pragma.carpooling.infrastructure.out.jpa.adapter;

import com.pragma.carpooling.domain.model.Barrio;
import com.pragma.carpooling.domain.model.Usuario;
import com.pragma.carpooling.domain.spi.IBarrioPersistencePort;
import com.pragma.carpooling.infrastructure.exception.BarrioAlreadyExistException;
import com.pragma.carpooling.infrastructure.exception.BarrioNotFoundException;
import com.pragma.carpooling.infrastructure.exception.NoDataFoundException;
import com.pragma.carpooling.infrastructure.out.jpa.entity.BarrioEntity;
import com.pragma.carpooling.infrastructure.out.jpa.entity.UsuarioEntity;
import com.pragma.carpooling.infrastructure.out.jpa.mapper.BarrioEntityMapper;
import com.pragma.carpooling.infrastructure.out.jpa.repository.IBarrioRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class BarrioJpaAdapter implements IBarrioPersistencePort {

    private final IBarrioRepository barrioRepository;
    private final BarrioEntityMapper barrioEntityMapper;

    @Override
    public Barrio guardarBarrio(Barrio barrio) {
        return barrioEntityMapper.toBarrio(barrioRepository.save(barrioEntityMapper.toEntity(barrio)));
    }

}
