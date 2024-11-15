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
@Table(name = "articulos")
public class ArticuloEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_articulo")
    private Long id;

    @Column(name = "nombre_autor", nullable = false, length = 60)
    private String nombreAutor;

    @Column(name = "imagen_autor", length = 350)
    private String imagenAutor;

    @Column(nullable = false, length = 1000)
    private String descripcion;

    @Column(name = "num_like")
    private int numLikes;

    @Column(name = "num_dislike")
    private int numDislikes;

    @Column(name = "is_active")
    private boolean isActive;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private UsuarioEntity usuario;

    @OneToMany(mappedBy = "articulo", fetch = FetchType.LAZY)
    private List<ProyectoEntity> proyectoList;

    @OneToMany(mappedBy = "articulo", fetch = FetchType.LAZY)
    private List<ComentarioEntity> comentarioList;

}
