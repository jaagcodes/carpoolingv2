package com.pragma.carpooling.infrastructure.out.jpa.mapper;

import com.pragma.carpooling.domain.model.Viaje;
import com.pragma.carpooling.infrastructure.out.jpa.entity.RutaBarrioEntity;
import com.pragma.carpooling.infrastructure.out.jpa.entity.RutaEntity;
import com.pragma.carpooling.infrastructure.out.jpa.entity.ViajeEntity;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-03T13:55:45-0500",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 11.0.13 (Eclipse Adoptium)"
)
@Component
public class ViajeEntityMapperImpl implements ViajeEntityMapper {

    @Override
    public ViajeEntity toEntity(Viaje viaje) {
        if ( viaje == null ) {
            return null;
        }

        ViajeEntity viajeEntity = new ViajeEntity();

        viajeEntity.setRutaBarrioEntity( viajeToRutaBarrioEntity( viaje ) );
        viajeEntity.setIdViaje( viaje.getIdViaje() );
        viajeEntity.setHorario( viaje.getHorario() );

        return viajeEntity;
    }

    @Override
    public Viaje toViaje(ViajeEntity viajeEntity) {
        if ( viajeEntity == null ) {
            return null;
        }

        Long idRuta = null;
        Long idViaje = null;
        LocalDateTime horario = null;

        idRuta = viajeEntityRutaBarrioEntityRutaEntityIdRuta( viajeEntity );
        idViaje = viajeEntity.getIdViaje();
        horario = viajeEntity.getHorario();

        Viaje viaje = new Viaje( idViaje, idRuta, horario );

        return viaje;
    }

    @Override
    public List<Viaje> toViajeList(List<ViajeEntity> viajeEntityList) {
        if ( viajeEntityList == null ) {
            return null;
        }

        List<Viaje> list = new ArrayList<Viaje>( viajeEntityList.size() );
        for ( ViajeEntity viajeEntity : viajeEntityList ) {
            list.add( toViaje( viajeEntity ) );
        }

        return list;
    }

    protected RutaEntity viajeToRutaEntity(Viaje viaje) {
        if ( viaje == null ) {
            return null;
        }

        RutaEntity rutaEntity = new RutaEntity();

        rutaEntity.setIdRuta( viaje.getIdRuta() );

        return rutaEntity;
    }

    protected RutaBarrioEntity viajeToRutaBarrioEntity(Viaje viaje) {
        if ( viaje == null ) {
            return null;
        }

        RutaBarrioEntity rutaBarrioEntity = new RutaBarrioEntity();

        rutaBarrioEntity.setRutaEntity( viajeToRutaEntity( viaje ) );

        return rutaBarrioEntity;
    }

    private Long viajeEntityRutaBarrioEntityRutaEntityIdRuta(ViajeEntity viajeEntity) {
        if ( viajeEntity == null ) {
            return null;
        }
        RutaBarrioEntity rutaBarrioEntity = viajeEntity.getRutaBarrioEntity();
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
}
