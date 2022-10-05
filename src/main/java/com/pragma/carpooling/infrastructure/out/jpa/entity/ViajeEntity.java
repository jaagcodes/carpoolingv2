package com.pragma.carpooling.infrastructure.out.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "viaje")
@Getter
@Setter
public class ViajeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_viaje")
    private Long idViaje;
    @ManyToOne
    @JoinColumn(
            name = "id_ruta"
    )
    private RutaBarrioEntity rutaBarrioEntity;
    @Column(name = "horario")
    private LocalDateTime horario;
}
