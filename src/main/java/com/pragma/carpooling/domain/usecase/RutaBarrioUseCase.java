package com.pragma.carpooling.domain.usecase;

import com.pragma.carpooling.domain.api.IRutaBarrioServicePort;
import com.pragma.carpooling.domain.model.Barrio;
import com.pragma.carpooling.domain.model.RutaBarrio;
import com.pragma.carpooling.domain.spi.IRutaBarrioPersistencePort;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RequiredArgsConstructor
public class RutaBarrioUseCase implements IRutaBarrioServicePort {

    private final IRutaBarrioPersistencePort rutaBarrioPersistencePort;

    @Override
    public void guardarRutaBarrio(List<Barrio>barriosList, Long idRuta) {
        String puntoEncuentro = barriosList.get(0).getNombre();
        AtomicInteger contador = new AtomicInteger(1);
        barriosList.forEach(barrio -> {
            rutaBarrioPersistencePort
                    .guardarRutaBarrio(new RutaBarrio(idRuta, barrio.getIdBarrio(), puntoEncuentro, contador.getAndIncrement()));
        });
    }
}
