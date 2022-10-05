package com.pragma.carpooling.factory;

import com.pragma.carpooling.domain.model.Usuario;

public class UsuarioDataTestFactory {


    public static Usuario getUsuario(){
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(1l);
        usuario.setNombres("Jose");
        usuario.setApellidos("Arrautt");
        usuario.setEmail("jarrautt@email.com");
        return usuario;
    }
}
