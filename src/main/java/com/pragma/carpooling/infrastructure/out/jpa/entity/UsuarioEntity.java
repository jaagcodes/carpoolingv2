package com.pragma.carpooling.infrastructure.out.jpa.entity;

import com.pragma.carpooling.domain.model.Ruta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "usuario",
        uniqueConstraints = @UniqueConstraint(
                name = "email_unique",
                columnNames = "email"
        )
)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name = "id_usuario"
    )
    private Long idUsuario;
    private String nombres;
    private String apellidos;
    private String email;

}
