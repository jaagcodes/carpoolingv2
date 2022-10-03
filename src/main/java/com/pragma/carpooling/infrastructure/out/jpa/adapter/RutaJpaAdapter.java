package com.pragma.carpooling.infrastructure.out.jpa.adapter;

import com.pragma.carpooling.domain.model.Ruta;
import com.pragma.carpooling.domain.model.Usuario;
import com.pragma.carpooling.domain.spi.IRutaPersistencePort;
import com.pragma.carpooling.infrastructure.exception.NoDataFoundException;
import com.pragma.carpooling.infrastructure.exception.RutaAlreadyExistsException;
import com.pragma.carpooling.infrastructure.exception.RutaNotFoundException;
import com.pragma.carpooling.infrastructure.out.jpa.entity.RutaEntity;
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

    @Override
    public List<Ruta> obteneterTodasRutas() {
        List<RutaEntity> rutaEntityList =  rutaRepository.findAll();
        if(rutaEntityList.isEmpty()){
            throw new NoDataFoundException();
        }
        return rutaEntityMapper.toRutaList(rutaEntityList);
    }

    @Override
    public Ruta obtenerRuta(Long idRuta) {
         return rutaEntityMapper.toRuta(rutaRepository.findById(idRuta).orElseThrow(RutaNotFoundException::new));
    }

    @Override
    public void actualizarRuta(Ruta ruta) {
        rutaRepository.save(rutaEntityMapper.toEntity(ruta));
    }

    @Override
    public void eliminarRuta(Long idRuta) {
        rutaRepository.deleteById(idRuta);
    }
}
