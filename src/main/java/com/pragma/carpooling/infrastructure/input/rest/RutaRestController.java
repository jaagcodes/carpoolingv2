package com.pragma.carpooling.infrastructure.input.rest;

import com.pragma.carpooling.application.dto.RutaCompletaRequest;
import com.pragma.carpooling.application.handler.IRutaHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ruta/")
@RequiredArgsConstructor
public class RutaRestController {

    private final IRutaHandler rutaHandler;

    @PostMapping("")
    public ResponseEntity<Void> guardarRutaCompleta(@RequestBody RutaCompletaRequest rutaCompletaRequest){
        rutaHandler.guardarRutaCompleta(rutaCompletaRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
