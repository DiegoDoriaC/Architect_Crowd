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
@Table(name = "roles")
public class RolEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private Long id;

    @Column(nullable = false, name = "nombre_rol")
    private String nombreRol;

    @OneToMany(mappedBy = "rol", fetch = FetchType.LAZY)
    private List<UsuarioEntity> usuario;

    @ManyToMany()
    @JoinTable(name = "roles_permisos", joinColumns = @JoinColumn(name = "id_rol"), inverseJoinColumns = @JoinColumn(name = "id_permiso"))
    private List<PermisoEntity> permisosList;

}
