package com.pragma.carpooling.infrastructure.out.jpa.mapper;

import com.pragma.carpooling.domain.model.Usuario;
import com.pragma.carpooling.infrastructure.out.jpa.entity.UsuarioEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-03T12:51:35-0500",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 11.0.13 (Eclipse Adoptium)"
)
@Component
public class UsuarioEntityMapperImpl implements UsuarioEntityMapper {

    @Override
    public UsuarioEntity toEntity(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        UsuarioEntity usuarioEntity = new UsuarioEntity();

        usuarioEntity.setIdUsuario( usuario.getIdUsuario() );
        usuarioEntity.setNombres( usuario.getNombres() );
        usuarioEntity.setApellidos( usuario.getApellidos() );
        usuarioEntity.setEmail( usuario.getEmail() );

        return usuarioEntity;
    }

    @Override
    public Usuario toUsuario(UsuarioEntity usuarioEntity) {
        if ( usuarioEntity == null ) {
            return null;
        }

        Long idUsuario = null;
        String nombres = null;
        String apellidos = null;
        String email = null;

        idUsuario = usuarioEntity.getIdUsuario();
        nombres = usuarioEntity.getNombres();
        apellidos = usuarioEntity.getApellidos();
        email = usuarioEntity.getEmail();

        Usuario usuario = new Usuario( idUsuario, nombres, apellidos, email );

        return usuario;
    }

    @Override
    public List<Usuario> toUsuarioList(List<UsuarioEntity> usuarioEntityList) {
        if ( usuarioEntityList == null ) {
            return null;
        }

        List<Usuario> list = new ArrayList<Usuario>( usuarioEntityList.size() );
        for ( UsuarioEntity usuarioEntity : usuarioEntityList ) {
            list.add( toUsuario( usuarioEntity ) );
        }

        return list;
    }
}
