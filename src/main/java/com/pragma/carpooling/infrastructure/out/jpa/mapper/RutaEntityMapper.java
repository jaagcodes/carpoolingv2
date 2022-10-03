package com.pragma.carpooling.infrastructure.out.jpa.mapper;

import com.pragma.carpooling.domain.model.Ruta;
import com.pragma.carpooling.infrastructure.out.jpa.entity.RutaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface RutaEntityMapper {

    @Mapping(target = "usuarioEntity.idUsuario", source = "idUsuario")
    RutaEntity toEntity(Ruta ruta);

    @Mapping(target = "idUsuario", source = "usuarioEntity.idUsuario")
    Ruta toRuta(RutaEntity rutaEntity);

    List<Ruta> toRutaList(List<RutaEntity> rutaEntityList);
}
