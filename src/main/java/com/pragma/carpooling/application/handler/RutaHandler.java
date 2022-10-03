package com.pragma.carpooling.application.handler;

import com.pragma.carpooling.application.dto.RutaCompletaRequest;
import com.pragma.carpooling.application.mapper.RutaCompletaRequestMapper;
import com.pragma.carpooling.domain.api.IRutaServicePort;
import com.pragma.carpooling.domain.model.Barrio;
import com.pragma.carpooling.domain.model.Ruta;
import com.pragma.carpooling.domain.model.Usuario;
import com.pragma.carpooling.domain.model.Viaje;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
@Transactional
public class RutaHandler implements IRutaHandler{

    private final IRutaServicePort rutaServicePort;
    private final RutaCompletaRequestMapper rutaCompletaRequestMapper;

    @Override
    public void guardarRutaCompleta(RutaCompletaRequest rutaCompletaRequest) {
        Ruta ruta = rutaCompletaRequestMapper.toRuta(rutaCompletaRequest);
        Usuario usuario = rutaCompletaRequestMapper.toUsuario(rutaCompletaRequest.getUsuario());
        List<Barrio> barriosList = rutaCompletaRequestMapper.toBarrioList(rutaCompletaRequest.getBarriosList());
        List<Viaje> viajesList = rutaCompletaRequestMapper.toViajeList(rutaCompletaRequest.getViajesList());
        viajesList.forEach(v -> System.out.println("Handler-------> "+v.getHorario()));
        rutaServicePort.guardarRutaCompleta(ruta, usuario,barriosList,viajesList);
    }
}
