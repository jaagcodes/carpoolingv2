package com.pragma.carpooling.infrastructure.out.jpa.adapter;

import com.pragma.carpooling.domain.model.Viaje;
import com.pragma.carpooling.domain.spi.IViajePersistencePort;
import com.pragma.carpooling.infrastructure.exception.NoDataFoundException;
import com.pragma.carpooling.infrastructure.exception.ViajeAlreadyExistsException;
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
    public Viaje guardarViaje(Viaje viaje) {
        return viajeEntityMapper.toViaje(viajeRepository.save(viajeEntityMapper.toEntity(viaje)));
    }

    @Override
    public void guardarViajesConRuta(Viaje viaje, Long idRuta) {
        viajeRepository.registrarConRuta(idRuta, viaje.getHorario());
    }

    @Override
    public List<Viaje> obteneterTodosViajes() {
        List<ViajeEntity> viajeEntityList = viajeRepository.findAll();
        if(viajeEntityList.isEmpty()){
            throw new NoDataFoundException();
        }
        return viajeEntityMapper.toViajeList(viajeEntityList);
    }

    @Override
    public Viaje obtenerViaje(Long idViaje) {
        return viajeEntityMapper.toViaje(viajeRepository.findById(idViaje).orElseThrow(ViajeNotFoundException::new));
    }

    @Override
    public void actualizarViaje(Viaje viaje) {
        viajeRepository.save(viajeEntityMapper.toEntity(viaje));
    }

    @Override
    public void eliminarViaje(Long idRuta) {
        viajeRepository.deleteById(idRuta);
    }
}
