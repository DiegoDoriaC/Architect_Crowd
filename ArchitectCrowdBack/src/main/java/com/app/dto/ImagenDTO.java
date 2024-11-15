package com.app.dto;

import com.app.entities.ProyectoEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
public class ImagenDTO {

    private Long id;
    @NotBlank @Size(max = 350)
    private String urlImagen;
    @JsonIgnore
    private ProyectoEntity proyecto;

}
