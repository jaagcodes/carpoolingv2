package com.pragma.carpooling.infrastructure.out.jpa.mapper;

import com.pragma.carpooling.domain.model.Barrio;
import com.pragma.carpooling.infrastructure.out.jpa.entity.BarrioEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-04T23:38:35-0500",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 14.0.1 (Oracle Corporation)"
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

        Barrio barrio = new Barrio();

        barrio.setIdBarrio( barrioEntity.getIdBarrio() );
        barrio.setNombre( barrioEntity.getNombre() );
        barrio.setDescripcion( barrioEntity.getDescripcion() );

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
