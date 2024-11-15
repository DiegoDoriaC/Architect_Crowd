package com.app.repository;

import com.app.entities.ProyectoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectoRepository extends JpaRepository<ProyectoEntity, Long> {
}
