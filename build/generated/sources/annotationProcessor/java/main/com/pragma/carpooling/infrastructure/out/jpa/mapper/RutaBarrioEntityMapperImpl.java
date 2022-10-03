package com.pragma.carpooling.infrastructure.out.jpa.mapper;

import com.pragma.carpooling.domain.model.RutaBarrio;
import com.pragma.carpooling.infrastructure.out.jpa.entity.BarrioEntity;
import com.pragma.carpooling.infrastructure.out.jpa.entity.RutaBarrioEntity;
import com.pragma.carpooling.infrastructure.out.jpa.entity.RutaEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-03T13:19:25-0500",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 11.0.13 (Eclipse Adoptium)"
)
@Component
public class RutaBarrioEntityMapperImpl implements RutaBarrioEntityMapper {

    @Override
    public RutaBarrio toRutaBarrio(RutaBarrioEntity rutaBarrioEntity) {
        if ( rutaBarrioEntity == null ) {
            return null;
        }

        Long idRuta = null;
        Long idBarrio = null;
        String puntoEncuentro = null;
        Integer posicion = null;

        idRuta = rutaBarrioEntityRutaEntityIdRuta( rutaBarrioEntity );
        idBarrio = rutaBarrioEntityBarrioEntityIdBarrio( rutaBarrioEntity );
        puntoEncuentro = rutaBarrioEntity.getPuntoEncuentro();
        posicion = rutaBarrioEntity.getPosicion();

        RutaBarrio rutaBarrio = new RutaBarrio( idRuta, idBarrio, puntoEncuentro, posicion );

        rutaBarrio.setId( rutaBarrioEntity.getId() );

        return rutaBarrio;
    }

    @Override
    public RutaBarrioEntity toRutaBarrioEntity(RutaBarrio rutaBarrio) {
        if ( rutaBarrio == null ) {
            return null;
        }

        RutaBarrioEntity rutaBarrioEntity = new RutaBarrioEntity();

        rutaBarrioEntity.setRutaEntity( rutaBarrioToRutaEntity( rutaBarrio ) );
        rutaBarrioEntity.setBarrioEntity( rutaBarrioToBarrioEntity( rutaBarrio ) );
        rutaBarrioEntity.setId( rutaBarrio.getId() );
        rutaBarrioEntity.setPuntoEncuentro( rutaBarrio.getPuntoEncuentro() );
        rutaBarrioEntity.setPosicion( rutaBarrio.getPosicion() );

        return rutaBarrioEntity;
    }

    @Override
    public List<RutaBarrio> toRutaBarrioList(List<RutaBarrioEntity> rutaBarrioEntityList) {
        if ( rutaBarrioEntityList == null ) {
            return null;
        }

        List<RutaBarrio> list = new ArrayList<RutaBarrio>( rutaBarrioEntityList.size() );
        for ( RutaBarrioEntity rutaBarrioEntity : rutaBarrioEntityList ) {
            list.add( toRutaBarrio( rutaBarrioEntity ) );
        }

        return list;
    }

    private Long rutaBarrioEntityRutaEntityIdRuta(RutaBarrioEntity rutaBarrioEntity) {
        if ( rutaBarrioEntity == null ) {
            return null;
        }
        RutaEntity rutaEntity = rutaBarrioEntity.getRutaEntity();
        if ( rutaEntity == null ) {
            return null;
        }
        Long idRuta = rutaEntity.getIdRuta();
        if ( idRuta == null ) {
            return null;
        }
        return idRuta;
    }

    private Long rutaBarrioEntityBarrioEntityIdBarrio(RutaBarrioEntity rutaBarrioEntity) {
        if ( rutaBarrioEntity == null ) {
            return null;
        }
        BarrioEntity barrioEntity = rutaBarrioEntity.getBarrioEntity();
        if ( barrioEntity == null ) {
            return null;
        }
        Long idBarrio = barrioEntity.getIdBarrio();
        if ( idBarrio == null ) {
            return null;
        }
        return idBarrio;
    }

    protected RutaEntity rutaBarrioToRutaEntity(RutaBarrio rutaBarrio) {
        if ( rutaBarrio == null ) {
            return null;
        }

        RutaEntity rutaEntity = new RutaEntity();

        rutaEntity.setIdRuta( rutaBarrio.getIdRuta() );

        return rutaEntity;
    }

    protected BarrioEntity rutaBarrioToBarrioEntity(RutaBarrio rutaBarrio) {
        if ( rutaBarrio == null ) {
            return null;
        }

        BarrioEntity barrioEntity = new BarrioEntity();

        barrioEntity.setIdBarrio( rutaBarrio.getIdBarrio() );

        return barrioEntity;
    }
}
