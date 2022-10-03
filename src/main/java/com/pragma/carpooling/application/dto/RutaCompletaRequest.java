package com.pragma.carpooling.application.dto;

import com.pragma.carpooling.domain.model.Barrio;
import com.pragma.carpooling.domain.model.Usuario;
import com.pragma.carpooling.domain.model.Viaje;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RutaCompletaRequest {

    private String descripcion;
    private Integer cupos;
    private UsuarioRequest usuario;
    private List<BarrioRequest> barriosList;
    private List<ViajeRequest> viajesList;
}
