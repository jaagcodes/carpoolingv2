package com.pragma.carpooling.infrastructure.input.rest;

import com.pragma.carpooling.application.dto.UsuarioRequest;
import com.pragma.carpooling.application.dto.UsuarioResponse;
import com.pragma.carpooling.application.handler.IUsuarioHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario/")
@RequiredArgsConstructor
public class UsuarioRestController {

    private final IUsuarioHandler usuarioHandler;

    @PostMapping("")
    public ResponseEntity<Void> guardarUsuario(@RequestBody UsuarioRequest usuarioRequest){
        usuarioHandler.guardarUsuario(usuarioRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("")
    public ResponseEntity<List<UsuarioResponse>> obtenerTodosLosUsuarios(){
        return ResponseEntity.ok(usuarioHandler.obtenerTodosLosUsuarios());
    }

    @GetMapping("{email}")
    public ResponseEntity<UsuarioResponse> obtenerUsuario(@PathVariable String email){
        return ResponseEntity.ok(usuarioHandler.obtenerUsuario(email));
    }

    @PutMapping
    public ResponseEntity<Void> actualizarUsuario(@RequestBody UsuarioRequest usuarioRequest){
        usuarioHandler.actualizarUsuario(usuarioRequest);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("{email}")
    public ResponseEntity<Void> eliminarUsuario(@PathVariable String email){
        usuarioHandler.eliminarUsuario(email);
        return ResponseEntity.noContent().build();
    }


}
