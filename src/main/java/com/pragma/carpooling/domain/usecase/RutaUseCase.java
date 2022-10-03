package com.pragma.carpooling.domain.usecase;

import com.pragma.carpooling.domain.api.IRutaServicePort;
import com.pragma.carpooling.domain.model.Barrio;
import com.pragma.carpooling.domain.model.Ruta;
import com.pragma.carpooling.domain.model.RutaBarrio;
import com.pragma.carpooling.domain.model.Usuario;
import com.pragma.carpooling.domain.model.Viaje;
import com.pragma.carpooling.domain.spi.IBarrioPersistencePort;
import com.pragma.carpooling.domain.spi.IRutaBarrioPersistencePort;
import com.pragma.carpooling.domain.spi.IRutaPersistencePort;
import com.pragma.carpooling.domain.spi.IUsuarioPersistencePort;
import com.pragma.carpooling.domain.spi.IViajePersistencePort;

import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;


@RequiredArgsConstructor
public class RutaUseCase implements IRutaServicePort {

    private final IRutaPersistencePort rutaPersistencePort;
    private final IUsuarioPersistencePort usuarioPersistencePort;
    private final IBarrioPersistencePort barrioPersistencePort;
    private final IRutaBarrioPersistencePort rutaBarrioPersistencePort;
    private final IViajePersistencePort viajePersistencePort;

    @Override
    public void guardarRutaCompleta(Ruta ruta, Usuario usuario, List<Barrio> barriosList, List<Viaje> viajesList) {

        //Guardando Usuario en BD
        Usuario usuarioPersistido = usuarioPersistencePort.guardarUsuario(usuario);

        //isConductor = idUsuario
        ruta.setIdConductor(usuarioPersistido.getIdUsuario());

        //Guardando Ruta BD
        Ruta rutaPersistida = rutaPersistencePort.guardarRuta(ruta);

        //Creando Set sin barrios repetidos
        Set<Barrio> barrioSet = new HashSet<>(barriosList);
        String puntoEncuentro = barriosList.get(0).getNombre();

        //Guardando Barrios en Base de Datos y RutaBarrio
        AtomicInteger contador = new AtomicInteger(1);
        barrioSet.forEach(barrio -> {
            Barrio barrioPersistido = barrioPersistencePort.guardarBarrio(barrio);
            System.out.println("id barrio: "+barrioPersistido.getIdBarrio());
            rutaBarrioPersistencePort
                    .guardarRutaBarrio(new RutaBarrio(rutaPersistida.getIdRuta(), barrioPersistido.getIdBarrio(), puntoEncuentro, contador.getAndIncrement()));
        });

        //Guardando Viajes

        viajesList.forEach(
          viaje ->{
              viajePersistencePort.guardarViajesConRuta(viaje,rutaPersistida.getIdRuta());
          }
        );



    }

}
