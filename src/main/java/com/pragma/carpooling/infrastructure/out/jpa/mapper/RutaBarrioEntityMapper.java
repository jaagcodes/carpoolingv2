package com.pragma.carpooling.infrastructure.out.jpa.mapper;

import com.pragma.carpooling.domain.model.RutaBarrio;
import com.pragma.carpooling.infrastructure.out.jpa.entity.RutaBarrioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface RutaBarrioEntityMapper {

    @Mapping(target = "idRuta", source="rutaEntity.idRuta")
    @Mapping(target = "idBarrio", source="barrioEntity.idBarrio")
    RutaBarrio toRutaBarrio(RutaBarrioEntity rutaBarrioEntity);

    @Mapping(target = "rutaEntity.idRuta", source="idRuta")
    @Mapping(target = "barrioEntity.idBarrio", source="idBarrio")
    RutaBarrioEntity toRutaBarrioEntity(RutaBarrio rutaBarrio);
    List<RutaBarrio> toRutaBarrioList(List<RutaBarrioEntity> rutaBarrioEntityList);

}
