package com.pragma.carpooling.application.mapper;

import com.pragma.carpooling.application.dto.UsuarioResponse;
import com.pragma.carpooling.domain.model.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(
        componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface UsuarioResponseMapper {

    UsuarioResponse toResponse(Usuario usuario);

    default List<UsuarioResponse> toResponseList(List<Usuario> usuarioList){
        return usuarioList.stream()
                .map( usuario -> {
                    UsuarioResponse response = new UsuarioResponse();
                    response.setIdUsuario(usuario.getIdUsuario());
                    response.setNombres(usuario.getNombres());
                    response.setApellidos(usuario.getApellidos());
                    response.setEmail(usuario.getEmail());
                    return response;
                }).collect(Collectors.toList());
    }
}
