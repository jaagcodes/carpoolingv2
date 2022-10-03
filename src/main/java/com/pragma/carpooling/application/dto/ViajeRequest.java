package com.pragma.carpooling.application.dto;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ViajeRequest {
    private LocalDateTime horario;
}
