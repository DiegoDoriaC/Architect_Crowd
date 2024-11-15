package com.app.dto;

import com.app.entities.PermisoEntity;
import com.app.entities.UsuarioEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Data
@Validated
public class RolDTO {

    private Long id;
    @NotBlank
    private String nombreRol;

    private List<UsuarioEntity> usuario;
    private List<PermisoEntity> permisosList;

}
