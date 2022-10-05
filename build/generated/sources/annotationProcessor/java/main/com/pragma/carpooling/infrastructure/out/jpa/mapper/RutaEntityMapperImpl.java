package com.pragma.carpooling.infrastructure.out.jpa.mapper;

import com.pragma.carpooling.domain.model.Ruta;
import com.pragma.carpooling.infrastructure.out.jpa.entity.RutaEntity;
import com.pragma.carpooling.infrastructure.out.jpa.entity.UsuarioEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-04T19:46:30-0500",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 14.0.1 (Oracle Corporation)"
)
@Component
public class RutaEntityMapperImpl implements RutaEntityMapper {

    @Override
    public RutaEntity toEntity(Ruta ruta) {
        if ( ruta == null ) {
            return null;
        }

        RutaEntity rutaEntity = new RutaEntity();

        rutaEntity.setUsuarioEntity( rutaToUsuarioEntity( ruta ) );
        rutaEntity.setIdRuta( ruta.getIdRuta() );
        rutaEntity.setDescripcion( ruta.getDescripcion() );
        rutaEntity.setCupos( ruta.getCupos() );

        return rutaEntity;
    }

    @Override
    public Ruta toRuta(RutaEntity rutaEntity) {
        if ( rutaEntity == null ) {
            return null;
        }

        Ruta ruta = new Ruta();

        ruta.setIdUsuario( rutaEntityUsuarioEntityIdUsuario( rutaEntity ) );
        ruta.setIdRuta( rutaEntity.getIdRuta() );
        ruta.setDescripcion( rutaEntity.getDescripcion() );
        ruta.setCupos( rutaEntity.getCupos() );

        return ruta;
    }

    @Override
    public List<Ruta> toRutaList(List<RutaEntity> rutaEntityList) {
        if ( rutaEntityList == null ) {
            return null;
        }

        List<Ruta> list = new ArrayList<Ruta>( rutaEntityList.size() );
        for ( RutaEntity rutaEntity : rutaEntityList ) {
            list.add( toRuta( rutaEntity ) );
        }

        return list;
    }

    protected UsuarioEntity rutaToUsuarioEntity(Ruta ruta) {
        if ( ruta == null ) {
            return null;
        }

        UsuarioEntity usuarioEntity = new UsuarioEntity();

        usuarioEntity.setIdUsuario( ruta.getIdUsuario() );

        return usuarioEntity;
    }

    private Long rutaEntityUsuarioEntityIdUsuario(RutaEntity rutaEntity) {
        if ( rutaEntity == null ) {
            return null;
        }
        UsuarioEntity usuarioEntity = rutaEntity.getUsuarioEntity();
        if ( usuarioEntity == null ) {
            return null;
        }
        Long idUsuario = usuarioEntity.getIdUsuario();
        if ( idUsuario == null ) {
            return null;
        }
        return idUsuario;
    }
}
