package com.pragma.carpooling.application.mapper;

import com.pragma.carpooling.application.dto.BarrioRequest;
import com.pragma.carpooling.application.dto.RutaCompletaRequest;
import com.pragma.carpooling.application.dto.UsuarioRequest;
import com.pragma.carpooling.application.dto.ViajeRequest;
import com.pragma.carpooling.domain.model.Barrio;
import com.pragma.carpooling.domain.model.Ruta;
import com.pragma.carpooling.domain.model.Usuario;
import com.pragma.carpooling.domain.model.Viaje;
import java.time.LocalDateTime;
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
public class RutaCompletaRequestMapperImpl implements RutaCompletaRequestMapper {

    @Override
    public Ruta toRuta(RutaCompletaRequest rutaCompletaRequest) {
        if ( rutaCompletaRequest == null ) {
            return null;
        }

        String descripcion = null;
        Integer cupos = null;

        descripcion = rutaCompletaRequest.getDescripcion();
        cupos = rutaCompletaRequest.getCupos();

        Long idRuta = null;
        Long idUsuario = null;

        Ruta ruta = new Ruta( idRuta, idUsuario, descripcion, cupos );

        return ruta;
    }

    @Override
    public Usuario toUsuario(UsuarioRequest usuarioRequest) {
        if ( usuarioRequest == null ) {
            return null;
        }

        String nombres = null;
        String apellidos = null;
        String email = null;

        nombres = usuarioRequest.getNombres();
        apellidos = usuarioRequest.getApellidos();
        email = usuarioRequest.getEmail();

        Long idUsuario = null;

        Usuario usuario = new Usuario( idUsuario, nombres, apellidos, email );

        return usuario;
    }

    @Override
    public List<Barrio> toBarrioList(List<BarrioRequest> barrioRequestList) {
        if ( barrioRequestList == null ) {
            return null;
        }

        List<Barrio> list = new ArrayList<Barrio>( barrioRequestList.size() );
        for ( BarrioRequest barrioRequest : barrioRequestList ) {
            list.add( barrioRequestToBarrio( barrioRequest ) );
        }

        return list;
    }

    @Override
    public List<Viaje> toViajeList(List<ViajeRequest> viajeRequestList) {
        if ( viajeRequestList == null ) {
            return null;
        }

        List<Viaje> list = new ArrayList<Viaje>( viajeRequestList.size() );
        for ( ViajeRequest viajeRequest : viajeRequestList ) {
            list.add( viajeRequestToViaje( viajeRequest ) );
        }

        return list;
    }

    protected Barrio barrioRequestToBarrio(BarrioRequest barrioRequest) {
        if ( barrioRequest == null ) {
            return null;
        }

        String nombre = null;
        String descripcion = null;

        nombre = barrioRequest.getNombre();
        descripcion = barrioRequest.getDescripcion();

        Long idBarrio = null;

        Barrio barrio = new Barrio( idBarrio, nombre, descripcion );

        return barrio;
    }

    protected Viaje viajeRequestToViaje(ViajeRequest viajeRequest) {
        if ( viajeRequest == null ) {
            return null;
        }

        LocalDateTime horario = null;

        horario = viajeRequest.getHorario();

        Long idViaje = null;
        Long idRuta = null;

        Viaje viaje = new Viaje( idViaje, idRuta, horario );

        return viaje;
    }
}
