package com.pragma.carpooling.infrastructure.out.jpa.mapper;

import com.pragma.carpooling.domain.model.Barrio;
import com.pragma.carpooling.infrastructure.out.jpa.entity.BarrioEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-03T16:35:57-0500",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 11.0.13 (Eclipse Adoptium)"
)
@Component
public class BarrioEntityMapperImpl implements BarrioEntityMapper {

    @Override
    public BarrioEntity toEntity(Barrio barrio) {
        if ( barrio == null ) {
            return null;
        }

        BarrioEntity barrioEntity = new BarrioEntity();

        barrioEntity.setIdBarrio( barrio.getIdBarrio() );
        barrioEntity.setNombre( barrio.getNombre() );
        barrioEntity.setDescripcion( barrio.getDescripcion() );

        return barrioEntity;
    }

    @Override
    public Barrio toBarrio(BarrioEntity barrioEntity) {
        if ( barrioEntity == null ) {
            return null;
        }

        Long idBarrio = null;
        String nombre = null;
        String descripcion = null;

        idBarrio = barrioEntity.getIdBarrio();
        nombre = barrioEntity.getNombre();
        descripcion = barrioEntity.getDescripcion();

        Barrio barrio = new Barrio( idBarrio, nombre, descripcion );

        return barrio;
    }

    @Override
    public List<Barrio> toBarrioList(List<BarrioEntity> barrioEntityList) {
        if ( barrioEntityList == null ) {
            return null;
        }

        List<Barrio> list = new ArrayList<Barrio>( barrioEntityList.size() );
        for ( BarrioEntity barrioEntity : barrioEntityList ) {
            list.add( toBarrio( barrioEntity ) );
        }

        return list;
    }
}
