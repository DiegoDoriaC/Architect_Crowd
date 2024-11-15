package com.app.dto;

import com.app.entities.ComentarioEntity;
import com.app.entities.ProyectoEntity;
import com.app.entities.UsuarioEntity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Data
@Validated
public class ArticuloDTO {

    private Long id;
    @NotBlank @Size(max = 60)
    private String nombreAutor;
    @NotBlank @Size(max = 350)
    private String imagenAutor;
    @NotBlank @Size(max = 1000)
    private String descripcion;
    @PositiveOrZero
    private int numLikes;
    @PositiveOrZero
    private int numDislikes;
    private boolean isActive;

    private UsuarioEntity usuario;
    private List<ProyectoEntity> proyectoList;
    private List<ComentarioEntity> comentarioList;

}
