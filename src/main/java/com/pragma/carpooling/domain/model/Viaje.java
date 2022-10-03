package com.pragma.carpooling.domain.model;

import java.time.LocalDateTime;

public class Viaje {

    private Long idViaje;
    private Long idRuta;
    private LocalDateTime horario;

    public Viaje(Long idViaje, Long idRuta, LocalDateTime horario) {
        this.idViaje = idViaje;
        this.idRuta = idRuta;
        this.horario = horario;
    }

    public Long getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(Long idViaje) {
        this.idViaje = idViaje;
    }

    public Long getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(Long idRuta) {
        this.idRuta = idRuta;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }
}
