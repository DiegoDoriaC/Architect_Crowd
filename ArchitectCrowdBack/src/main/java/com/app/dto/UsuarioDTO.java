package com.app.dto;

import com.app.entities.ArticuloEntity;
import com.app.entities.ComentarioEntity;
import com.app.entities.RolEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Data
@Validated
public class UsuarioDTO {

    private Long id;
    @NotBlank @Size(min = 5, max = 30)
    private String nombre;
    @NotBlank @Size(max = 40) @Email
    private String correo;
    @NotBlank @Size(min = 6)
    private String password;
    private String avatar;
    @NotBlank
    private RolEntity rol;

    private List<ArticuloEntity> articulosList;
    private List<ComentarioEntity> comentarioList;

}
