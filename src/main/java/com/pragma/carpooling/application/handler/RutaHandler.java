package com.pragma.carpooling.application.handler;

import com.pragma.carpooling.application.dto.RutaCompletaRequest;
import com.pragma.carpooling.application.mapper.RutaCompletaRequestMapper;
import com.pragma.carpooling.domain.api.IBarrioServicePort;
import com.pragma.carpooling.domain.api.IRutaBarrioServicePort;
import com.pragma.carpooling.domain.api.IRutaServicePort;
import com.pragma.carpooling.domain.api.IUsuarioServicePort;
import com.pragma.carpooling.domain.api.IViajeServicePort;
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
    private final IUsuarioServicePort usuarioServicePort;
    private final IBarrioServicePort barrioServicePort;
    private final IRutaBarrioServicePort rutaBarrioServicePort;
    private final IViajeServicePort viajeServicePort;
    private final RutaCompletaRequestMapper rutaCompletaRequestMapper;

    @Override
    public void guardarRutaCompleta(RutaCompletaRequest rutaCompletaRequest) {
        Usuario usuario = usuarioServicePort.guardarUsuario(rutaCompletaRequestMapper.toUsuario(rutaCompletaRequest.getUsuario()));
        Ruta ruta = rutaCompletaRequestMapper.toRuta(rutaCompletaRequest);
        Long idConductor = usuario.getIdUsuario();
        ruta.setIdUsuario(idConductor);
        ruta = rutaServicePort.guardarRuta(ruta);
        Long idRuta = ruta.getIdRuta();
        List<Barrio> barriosList = barrioServicePort.guardarListabarrios(rutaCompletaRequestMapper.toBarrioList(rutaCompletaRequest.getBarriosList()));
        rutaBarrioServicePort.guardarRutaBarrio(barriosList, idRuta);
        List<Viaje> viajesList = rutaCompletaRequestMapper.toViajeList(rutaCompletaRequest.getViajesList());
        viajeServicePort.guardarListaViajes(viajesList, idRuta);
    }
}
