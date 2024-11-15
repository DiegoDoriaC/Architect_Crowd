package com.app.entities;


import jakarta.persistence.*;
import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "comentarios")
public class ComentarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comentario")
    private Long id;

    @Column(nullable = false, length = 500)
    private String comentario;

    @Column(name = "num_like")
    private int numLikes;

    @Column(name = "num_dislike")
    private int numDislikes;

    @Column(name = "is_active")
    private boolean isActive;

    @ManyToOne()
    @JoinColumn(name = "id_articulo")
    private ArticuloEntity articulo;

    @ManyToOne()
    @JoinColumn(name = "id_usuario")
    private UsuarioEntity usuario;

}
