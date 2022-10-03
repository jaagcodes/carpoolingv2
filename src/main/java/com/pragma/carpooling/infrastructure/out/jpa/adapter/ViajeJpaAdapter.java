package com.pragma.carpooling.infrastructure.out.jpa.adapter;

import com.pragma.carpooling.domain.model.Viaje;
import com.pragma.carpooling.domain.spi.IViajePersistencePort;
import com.pragma.carpooling.infrastructure.exception.NoDataFoundException;
import com.pragma.carpooling.infrastructure.exception.ViajeNotFoundException;
import com.pragma.carpooling.infrastructure.out.jpa.entity.ViajeEntity;
import com.pragma.carpooling.infrastructure.out.jpa.mapper.ViajeEntityMapper;
import com.pragma.carpooling.infrastructure.out.jpa.repository.IViajeRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ViajeJpaAdapter implements IViajePersistencePort {

    private final ViajeEntityMapper viajeEntityMapper;
    private final IViajeRepository viajeRepository;


    @Override
    public void guardarViajesConRuta(Long idRuta, Viaje viaje) {
         viajeRepository.registrarConRuta(idRuta, viaje.getHorario());
    }

}
