package com.app.entities;


import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "imagenes")
public class ImagenEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comentario")
    private Long id;

    @Column(nullable = false, length = 350)
    private String urlImagen;

    @ManyToOne
    @JoinColumn(name = "imagen")
    private ProyectoEntity proyecto;

}
