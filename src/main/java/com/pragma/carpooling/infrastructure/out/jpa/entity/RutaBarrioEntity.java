package com.pragma.carpooling.infrastructure.out.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "ruta_barrio")
@Getter
@Setter
public class RutaBarrioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(
            name = "id_ruta"
    )
    private RutaEntity rutaEntity;

    @ManyToOne
    @JoinColumn(
            name = "id_barrio"
    )
    private BarrioEntity barrioEntity;

    private String puntoEncuentro;

    private Integer posicion;

}
