package com.pragma.carpooling.application.mapper;

import com.pragma.carpooling.application.dto.BarrioRequest;
import com.pragma.carpooling.application.dto.RutaCompletaRequest;
import com.pragma.carpooling.application.dto.UsuarioRequest;
import com.pragma.carpooling.application.dto.ViajeRequest;
import com.pragma.carpooling.domain.model.Barrio;
import com.pragma.carpooling.domain.model.Ruta;
import com.pragma.carpooling.domain.model.Usuario;
import com.pragma.carpooling.domain.model.Viaje;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-05T00:55:53-0500",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 14.0.1 (Oracle Corporation)"
)
@Component
public class RutaCompletaRequestMapperImpl implements RutaCompletaRequestMapper {

    @Override
    public Ruta toRuta(RutaCompletaRequest rutaCompletaRequest) {
        if ( rutaCompletaRequest == null ) {
            return null;
        }

        Ruta ruta = new Ruta();

        ruta.setDescripcion( rutaCompletaRequest.getDescripcion() );
        ruta.setCupos( rutaCompletaRequest.getCupos() );

        return ruta;
    }

    @Override
    public Usuario toUsuario(UsuarioRequest usuarioRequest) {
        if ( usuarioRequest == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setNombres( usuarioRequest.getNombres() );
        usuario.setApellidos( usuarioRequest.getApellidos() );
        usuario.setEmail( usuarioRequest.getEmail() );

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

        Barrio barrio = new Barrio();

        barrio.setNombre( barrioRequest.getNombre() );
        barrio.setDescripcion( barrioRequest.getDescripcion() );

        return barrio;
    }

    protected Viaje viajeRequestToViaje(ViajeRequest viajeRequest) {
        if ( viajeRequest == null ) {
            return null;
        }

        Viaje viaje = new Viaje();

        viaje.setHorario( viajeRequest.getHorario() );

        return viaje;
    }
}
