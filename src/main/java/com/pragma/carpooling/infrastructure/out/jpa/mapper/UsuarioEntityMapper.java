package com.pragma.carpooling.infrastructure.out.jpa.mapper;

import com.pragma.carpooling.domain.model.Usuario;
import com.pragma.carpooling.infrastructure.out.jpa.entity.UsuarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface UsuarioEntityMapper {

    UsuarioEntity toEntity(Usuario usuario);

    Usuario toUsuario(UsuarioEntity usuarioEntity);

    List<Usuario> toUsuarioList(List<UsuarioEntity> usuarioEntityList);

}
