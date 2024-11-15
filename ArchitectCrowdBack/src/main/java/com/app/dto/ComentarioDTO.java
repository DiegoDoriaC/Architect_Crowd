package com.app.dto;

import com.app.entities.ArticuloEntity;
import com.app.entities.UsuarioEntity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
public class ComentarioDTO {

    private Long id;
    @NotBlank @Size(max = 500)
    private String comentario;
    @PositiveOrZero
    private int numLikes;
    @PositiveOrZero
    private int numDislikes;
    private boolean isActive;

    private ArticuloEntity articulo;
    private UsuarioEntity usuario;

}
