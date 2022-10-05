package com.pragma.carpooling.domain.spi;

import com.pragma.carpooling.domain.model.Usuario;


public interface IUsuarioPersistencePort {

    Usuario guardarUsuario(Usuario usuario);

    Usuario obtenerUsuario(String emailUsuario);


}
