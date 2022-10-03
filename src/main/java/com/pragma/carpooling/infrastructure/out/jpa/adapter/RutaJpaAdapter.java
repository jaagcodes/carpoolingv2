package com.pragma.carpooling.infrastructure.out.jpa.adapter;

import com.pragma.carpooling.domain.model.Ruta;
import com.pragma.carpooling.domain.spi.IRutaPersistencePort;
import com.pragma.carpooling.infrastructure.out.jpa.mapper.RutaEntityMapper;
import com.pragma.carpooling.infrastructure.out.jpa.repository.IRutaRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class RutaJpaAdapter implements IRutaPersistencePort {

    private final IRutaRepository rutaRepository;
    private final RutaEntityMapper rutaEntityMapper;

    @Override
    public Ruta guardarRuta(Ruta ruta) {
         return rutaEntityMapper.toRuta(rutaRepository.save(rutaEntityMapper.toEntity(ruta)));
    }
}
