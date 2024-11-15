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
@Table(name = "proyectos")
public class ProyectoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proyecto")
    private Long id;

    @Column(nullable = false, length = 50)
    private String titulo;

    @Column(nullable = false, length = 1000)
    private String descripcion;

    @Column(name = "is_active")
    private boolean isActive;

    @JoinColumn(name = "id_articulo")
    @ManyToOne()
    private ArticuloEntity articulo;

    @OneToMany(mappedBy = "proyecto", fetch = FetchType.LAZY)
    private List<ImagenEntity> imagenProyecto;

}
