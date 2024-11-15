package com.app.dto;

import com.app.entities.ArticuloEntity;
import com.app.entities.ImagenEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Data
@Validated
public class ProyectoDTO {

    private Long id;
    @NotBlank @Size(max = 50)
    private String titulo;
    @NotBlank @Size(max = 1000)
    private String descripcion;
    private boolean isActive;

    private ArticuloEntity articulo;
    private List<ImagenEntity> imagenProyecto;

}
