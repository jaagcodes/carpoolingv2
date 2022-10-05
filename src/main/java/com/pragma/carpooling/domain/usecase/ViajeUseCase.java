package com.pragma.carpooling.domain.usecase;

import com.pragma.carpooling.domain.api.IViajeServicePort;
import com.pragma.carpooling.domain.model.Viaje;
import com.pragma.carpooling.domain.spi.IViajePersistencePort;
import com.pragma.carpooling.infrastructure.exception.HorarioNullException;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@RequiredArgsConstructor
public class ViajeUseCase implements IViajeServicePort {

    private final IViajePersistencePort viajePersistencePort;

    @Override
    public void guardarListaViajes(List<Viaje> viajesList, Long idRuta) {

        if(!validarViajesContienenFechaHora(viajesList)){
            throw new HorarioNullException();
        }

        viajesList.stream().forEach(
                viaje -> {
                     viajePersistencePort.guardarViajesConRuta(idRuta , viaje);
                }
        );
    }

    public boolean validarViajesContienenFechaHora(List<Viaje> viajesList){
        AtomicBoolean valido = new AtomicBoolean(true);
        viajesList.stream().forEach(
                viaje -> {
                    if(viaje.getHorario()==null){
                      valido.set(false);
                    }
                }
        );
        return valido.get();
    }

}
