package com.pragma.carpooling.application.mapper;

import com.pragma.carpooling.application.dto.UsuarioRequest;
import com.pragma.carpooling.domain.model.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface UsuarioRequestMapper {

    Usuario toUsuario (UsuarioRequest usuarioRequest);

}
