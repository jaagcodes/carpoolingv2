package com.pragma.carpooling.application.handler;

import com.pragma.carpooling.application.dto.UsuarioRequest;
import com.pragma.carpooling.application.dto.UsuarioResponse;
import com.pragma.carpooling.application.mapper.UsuarioRequestMapper;
import com.pragma.carpooling.application.mapper.UsuarioResponseMapper;
import com.pragma.carpooling.domain.api.IUsuarioServicePort;
import com.pragma.carpooling.domain.model.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UsuarioHandler implements IUsuarioHandler{

    private final IUsuarioServicePort usuarioServicePort;
    private final UsuarioRequestMapper usuarioRequestMapper;
    private final UsuarioResponseMapper usuarioResponseMapper;

    @Override
    public void guardarUsuario(UsuarioRequest usuarioRequest) {
        Usuario usuario =  usuarioRequestMapper.toUsuario(usuarioRequest);
        usuarioServicePort.guardarUsuario(usuario);
    }

    @Override
    public List<UsuarioResponse> obtenerTodosLosUsuarios() {
        return usuarioResponseMapper.toResponseList(usuarioServicePort.obteneterTodosUsuarios());
    }

    @Override
    public UsuarioResponse obtenerUsuario(String email) {
        Usuario usuario = usuarioServicePort.obtenerUsuario(email);
        return usuarioResponseMapper.toResponse(usuario);
    }

    @Override
    public void actualizarUsuario(UsuarioRequest usuarioRequest) {
        Usuario usuarioViejo = usuarioServicePort.obtenerUsuario(usuarioRequest.getEmail());
        Usuario usuarioNuevo = usuarioRequestMapper.toUsuario(usuarioRequest);
        usuarioNuevo.setIdUsuario(usuarioViejo.getIdUsuario());
        usuarioServicePort.actualizarUsuario(usuarioNuevo);
    }

    @Override
    public void eliminarUsuario(String emailUsuario) {
        Usuario usuario = usuarioServicePort.obtenerUsuario(emailUsuario);
        usuarioServicePort.eliminarUsuario(emailUsuario);
    }
}
