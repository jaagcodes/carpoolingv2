package com.pragma.carpooling.infrastructure.out.jpa.mapper;


import com.pragma.carpooling.domain.model.Barrio;
import com.pragma.carpooling.infrastructure.out.jpa.entity.BarrioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface BarrioEntityMapper {

    BarrioEntity toEntity(Barrio barrio);

    Barrio toBarrio(BarrioEntity barrioEntity);

    List<Barrio> toBarrioList(List<BarrioEntity> barrioEntityList);

}
