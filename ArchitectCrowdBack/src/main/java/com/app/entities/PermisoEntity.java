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
@Table(name = "permisos")
public class PermisoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_permiso")
    private Long id;

    @Column(nullable = false, name = "nombre_permiso")
    private String nombrePermiso;

    @ManyToMany(mappedBy = "permisosList")
    private List<RolEntity> rolesList;

}
