package com.pragma.carpooling.infrastructure.out.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(
        name = "ruta"
)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RutaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ruta")
    private Long idRuta;
    private String descripcion;
    private Integer cupos;
    @ManyToOne
    @JoinColumn(
            name = "id_usuario"
    )
    private UsuarioEntity usuarioEntity;

}
