package com.pragma.carpooling.infrastructure.out.jpa.mapper;

import com.pragma.carpooling.domain.model.Viaje;
import com.pragma.carpooling.infrastructure.out.jpa.entity.ViajeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface ViajeEntityMapper {

    @Mapping(target = "rutaBarrioEntity.rutaEntity.idRuta", source = "idRuta")
    ViajeEntity toEntity(Viaje viaje);

    @Mapping(target = "idRuta", source = "rutaBarrioEntity.rutaEntity.idRuta")
    Viaje toViaje(ViajeEntity viajeEntity);

    List<Viaje> toViajeList(List<ViajeEntity> viajeEntityList);
}
