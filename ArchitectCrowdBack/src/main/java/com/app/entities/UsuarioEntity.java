package com.app.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "usuarios")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id;

    @Column(nullable = false, length = 30)
    private String nombre;

    @Column(nullable = false, length = 40, unique = true)
    private String correo;

    @Column(nullable = false, length = 30)
    private String password;

    @Column(nullable = false)
    private String avatar;

    @Column(nullable = false)
    private boolean activo;

    @ManyToOne()
    @JoinColumn(name = "id_rol")
    private RolEntity rol;

    @OneToMany(mappedBy = "usuario")
    private List<ArticuloEntity> articulosList;

    @OneToMany(mappedBy = "usuario")
    private List<ComentarioEntity> comentarioList;

}
