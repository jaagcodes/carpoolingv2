package com.pragma.carpooling.application.mapper;

import com.pragma.carpooling.application.dto.BarrioRequest;
import com.pragma.carpooling.application.dto.RutaCompletaRequest;
import com.pragma.carpooling.application.dto.RutaRequest;
import com.pragma.carpooling.application.dto.UsuarioRequest;
import com.pragma.carpooling.application.dto.ViajeRequest;
import com.pragma.carpooling.domain.model.Barrio;
import com.pragma.carpooling.domain.model.Ruta;
import com.pragma.carpooling.domain.model.Usuario;
import com.pragma.carpooling.domain.model.Viaje;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(
        componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface RutaCompletaRequestMapper {

    Ruta toRuta(RutaCompletaRequest rutaCompletaRequest);

    Usuario toUsuario(UsuarioRequest usuarioRequest);

    List<Barrio> toBarrioList(List<BarrioRequest> barrioRequestList);

    List<Viaje> toViajeList(List<ViajeRequest> viajeRequestList);

}
